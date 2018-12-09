package com.xinbao.mmbiz;

import com.xinbao.framework.datasource.DruidConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DruidConfig.class})
@MapperScan("com.xinbao.mmbiz.*.dao")
@EnableAutoConfiguration
public class MmbizApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmbizApplication.class, args);
	}
}

