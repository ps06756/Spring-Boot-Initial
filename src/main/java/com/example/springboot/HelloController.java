package com.example.springboot;

import com.example.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//	@Autowired
	private HelloService helloService;

	public HelloController(HelloService service) {
		this.helloService = service;
	}

	@GetMapping("/")
	public String index() {
		return helloService.sendHello();
	}

}
