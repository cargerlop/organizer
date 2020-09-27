package com.organizer.io.greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

	@RequestMapping("/greeting")
	public String greeting(){
		return "Hello friend!";
	}
}
