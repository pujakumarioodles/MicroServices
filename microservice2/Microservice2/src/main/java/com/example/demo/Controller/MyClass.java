package com.example.demo.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
@RefreshScope
public class MyClass {
	
	private Logger log=(Logger) LoggerFactory.getLogger(MyClass.class);
	
/*	
 * this is to get from config server
	@Value("${microservice.MicroService1.endpoints.endpoint.uri}")
	private String ENDPOINT_URI;
	*/
	@GetMapping("/a")
	public String hhh()
	{
		log.info("this is log of microservices2");
		System.out.println("hhgg");
		//System.out.println("ENDPOINT_URI"+ENDPOINT_URI);
		return "puja is the Great";
	}

}
