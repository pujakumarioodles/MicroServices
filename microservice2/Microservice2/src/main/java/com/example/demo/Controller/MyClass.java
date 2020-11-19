package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
	
	
	
	@GetMapping("/a")
	public String hhh()
	{
		System.out.println("hhgg");
		return "puja is the Great";
	}

}
