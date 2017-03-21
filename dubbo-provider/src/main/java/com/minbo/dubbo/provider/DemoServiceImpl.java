package com.minbo.dubbo.provider;

public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		return "Welcome to Minbo's Dubbo, Hello " + name;
	}

}
