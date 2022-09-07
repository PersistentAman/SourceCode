package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
	
	@Autowired
	private messageretrieval service;
	@RequestMapping("/welcome")
	public String welcome() {
		return service.message();
	}

}


