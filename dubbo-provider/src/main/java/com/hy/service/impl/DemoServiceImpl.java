package com.hy.service.impl;

import com.hy.service.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		System.out.println("init : " + name);
		return "hello " + name;
	}

}
