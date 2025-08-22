package com.example.demo.controler;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/userData")
	public List<String> userData() {
		List<String> userList =Arrays.asList("vijay","ajay", "sanjay"); 
		
		
		return userList;
		
		
	}

}
