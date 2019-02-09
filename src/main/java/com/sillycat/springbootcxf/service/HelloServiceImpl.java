package com.sillycat.springbootcxf.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	public void sayHello(String name) {
		LOGGER.info("Hello, super " + name);
	}

}
