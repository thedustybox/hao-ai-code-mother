package com.hao.haoaicodemother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class HaoAiCodeMotherApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaoAiCodeMotherApplication.class, args);
	}

}
