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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.xinbao.mmbiz.sys.dao", sqlSessionTemplateRef = "mysql1SqlSessionTemplate")
public class Mysql1DataSourceConfig {
    @Bean(name = "mysql1DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.mysql1")
    @Primary
    public DataSource setDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mysql1TransactionManager")
    public DruidDataSource setTransactionManager(@Qualifier("mysql1DataSource") DataSource dataSource) {
        return new DruidDataSource();
    }

    @Bean(name = "mysql1SqlSessionFactory")
    @Primary
    public SqlSessionFactory setSqlSessionFactory(@Qualifier("mysql1DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/mysql1/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "mysql1SqlSessionTemplate")
    @Primary
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("mysql1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
