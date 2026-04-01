package com.harsha.SimpleSpring01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Requestparem {
	@GetMapping("/value")
	public String getId(@RequestParam int id) {
		return "id" + id;
		
	}

}
