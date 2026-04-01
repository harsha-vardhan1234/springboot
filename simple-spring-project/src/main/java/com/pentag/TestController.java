package com.pentag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/view")
	public String get() {
		return "hello";
	}

}
