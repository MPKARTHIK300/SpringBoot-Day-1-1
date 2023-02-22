package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MPK1 {
	@GetMapping("/MPK1")
	public String display() {
		return "welcome";
	}

}
