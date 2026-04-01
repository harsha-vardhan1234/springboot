package com.harsha.SimpleSpring01;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHeaderr {
@PostMapping("/req")
public String get(@CookieValue String name ) {
	return " name "+ name;
}

}
