package abc.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyFirstMicroService {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/b")
	public String fun()
	{
		String ab=restTemplate.getForObject("http://MicroService2/a",String.class);
		
		System.out.println("puja"+ab);
		return ab;
	}

}
