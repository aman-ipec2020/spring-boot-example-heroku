package com.springboot.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootOpenshiftApplication {

	@GetMapping("/")
	public String index()	{
		return "<h1>hey, there..!!!</h1>";
	}
	
	@GetMapping("/{name}")
	public String input(@PathVariable String name)	{
		return "hi, " + name + "your application deployed successfully";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootOpenshiftApplication.class, args);
	}
}
