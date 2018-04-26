package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class BootWS {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Hi in welcome";
	}
	@RequestMapping("/Display")
	public String display() {
		return "hi in Display";
	}
	@RequestMapping("/addition/{a}/{b}")
	public String addition(@PathVariable int a, @PathVariable int b) {
		return Integer.toString(a+b);
	}

	public static void main(String[] args) {
		
		SpringApplication.run(BootWS.class, args);
		
	}

}
