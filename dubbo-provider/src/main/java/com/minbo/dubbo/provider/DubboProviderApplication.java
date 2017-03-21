package com.minbo.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// 使用 providers.xml 配置
@ImportResource(value = { "classpath:providers.xml" })
public class DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}
}
