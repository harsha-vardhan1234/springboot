package com.pentagon.Spring_database_project;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@PostMapping("/student1")
	public String insert(@RequestBody Student1 obj) {
		
		return "id  is "+obj.getId()+"   name is " +obj.getName();
		}
	@PostMapping(value="/value",consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public String value(@RequestBody Value v) {
		return v.getId()+"  "+v.getInterest()+"  "+v.getBalance();
		
	}

}
