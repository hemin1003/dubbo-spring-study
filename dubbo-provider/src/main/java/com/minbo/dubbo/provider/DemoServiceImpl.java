package com.minbo.dubbo.provider;

public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "Welcome to Minbo's Dubbo, Hello " + name;
	}

}
