package com.pentagon.Spring_database_project;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestC {
	@Autowired
	Studentrepoditory sc;
//	@PostMapping("/student")
//	public String update(@RequestBody Student1 st) {
//		sc.save(st);
//		
//		return "added successfully";
//		
//	}
//	@PutMapping("/update")
//	public String insert(@RequestBody Student1 st) {
//		sc.save(st);
//		return "inserted";
//	}
//	@GetMapping(value="/student",produces=MediaType.APPLICATION_XML_VALUE)
//	public List<Student1> getall(){
//		List<Student1> s=sc.findAll();
//		return s;
//	}
//	
//	@PostMapping("/sall")
//	public String addall(@RequestBody List<Student1> stu) {
//		sc.saveAll( stu);
//		return "done adding";
//	}
//	
//	@DeleteMapping("/de/{id}")
//	public String delete(@PathVariable int id) {
//		if(sc.existsById(id)) {
//			sc.deleteById(id);
//			return "deleted successfully";
//			
//		}else {
//			return "id not found";
//		}
//		}
	
//	@PostMapping("/student")
//	public ResponseStructre<Student1> save(@RequestBody Student1 st){
//		Student1 s=sc.save(st);
//		ResponseStructre<Student1> rs=new ResponseStructre<Student1>();
//		rs.setStatuscode(200);
//		rs.setMessage("success");
//		rs.setData(s);
//		return rs;
//		
//	}
//	@GetMapping("/student/{id}")
//	public ResponseStructre<Student1> getBYId(@PathVariable int id){
//		Optional<Student1> op= sc.findById(id);
//		Student1 st;
//		ResponseStructre<Student1> rs=new ResponseStructre<Student1>();
//		if(op.isPresent()) {
//		
//			st=op.get();
//			rs.setStatuscode(100);
//			rs.setMessage("success");
//			rs.setData(st);
//		}
//		else {
//			st=null;
//			rs.setStatuscode(404);
//			rs.setMessage("id not found ");
//			rs.setData(st);
//		}
//		return rs;
//		}
	
	@GetMapping("/student/{name}")
	public ResponseEntity< ResponseStructre<Student1>> findName(@PathVariable String name){
		ResponseStructre<Student1> rs=new ResponseStructre<Student1>();
		List<Student1> l=sc.findName(name);
		rs.setData(l);
		rs.setStatuscode(HttpStatus.FOUND.value());
		rs.setMessage("found");
		return new ResponseEntity< ResponseStructre<Student1>>(rs,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/student")
	public ResponseEntity< ResponseStructre<Student1>> save(@RequestBody Student1 st){
		String name=st.getName();
		name=name+"|length :"+name.length();
		st.setName(name);
		Student1 s=sc.save(st);
		ResponseStructre<Student1> rs=new ResponseStructre<Student1>();
		rs.setStatuscode(HttpStatus.ACCEPTED.value());
		rs.setMessage("success");
		//rs.setData(s);
		return new ResponseEntity<ResponseStructre<Student1>>(rs,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<ResponseStructre<Student1>> getbyRoll(@PathVariable int id){
		Optional<Student1> op=sc.findById(id);
		ResponseStructre<Student1> rs=new ResponseStructre<Student1>();
		if(op.isPresent()) {
			Student1 s=op.get();
			rs.setStatuscode(HttpStatus.FOUND.value());
			rs.setMessage("success");
			//rs.setData(s);
			return new ResponseEntity<ResponseStructre<Student1>>(rs,HttpStatus.FOUND);
		}
		else {
			Student1 s=null;
			rs.setStatuscode(HttpStatus.NOT_FOUND.value());
			rs.setMessage("not found");
			//rs.setData(s);
			return new ResponseEntity<ResponseStructre<Student1>>(rs,HttpStatus.NOT_FOUND);
		}
		
	}
	
	}



