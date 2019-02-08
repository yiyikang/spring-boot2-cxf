package com.sillycat.springbootcxf.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

	@GetMapping(value = "/mini")
	@ResponseBody
	public ResponseEntity<?> list() {
		ResponseEntity<?> response = new ResponseEntity<String>("hello YiYi Kang", HttpStatus.OK);
		return response;
	}

}
