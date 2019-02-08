package com.sillycat.springbootcxf.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
	
	public void sayHello(String name) {
		System.out.println("Hello, super " + name);
	}

}
