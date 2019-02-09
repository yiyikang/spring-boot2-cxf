package com.sillycat.springbootcxf.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
	
	protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@GetMapping(value = "/mini")
	@ResponseBody
	public ResponseEntity<?> list() {
		LOGGER.info("HelloController entered.");
		ResponseEntity<?> response = new ResponseEntity<String>("hello YiYi Kang", HttpStatus.OK);
		return response;
	}

}
