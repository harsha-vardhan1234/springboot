package com.harsha.SimpleSpring01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
        @PostMapping("/v/{user_id}/")
		public String get(@PathVariable("user_id") int id,@RequestParam String name  ) {
			return "id:" +id +"name is :"+name ;
		}

	}

