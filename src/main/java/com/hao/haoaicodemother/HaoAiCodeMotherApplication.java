package com.hao.haoaicodemother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("com.hao.haoaicodemother.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class HaoAiCodeMotherApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaoAiCodeMotherApplication.class, args);
	}

}
