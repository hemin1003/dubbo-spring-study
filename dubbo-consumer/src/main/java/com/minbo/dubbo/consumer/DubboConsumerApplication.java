package com.minbo.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// 使用 consumers.xml 配置；
@ImportResource(value = { "classpath:consumers.xml" })
public class DubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
	}
}
