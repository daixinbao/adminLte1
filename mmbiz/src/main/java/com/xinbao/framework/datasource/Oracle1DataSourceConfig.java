package com.xinbao.framework.datasource;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.xinbao.mmbiz.prj", sqlSessionTemplateRef = "oracle1SqlSessionTemplate")
public class Oracle1DataSourceConfig {
    @Bean(name = "oracle1DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.oracle1")
    public DataSource setDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "oracle1TransactionManager")
    public DruidDataSource setTransactionManager(@Qualifier("oracle1DataSource") DataSource dataSource) {
        return new DruidDataSource();
    }

    @Bean(name = "oracle1SqlSessionFactory")
    public SqlSessionFactory setSqlSessionFactory(@Qualifier("oracle1DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/mysql1/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "oracle1SqlSessionTemplate")
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("oracle1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
