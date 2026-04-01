package com.pentagon.Spring_database_project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Studentrepoditory extends JpaRepository<Student1 ,Integer>{
	List<Student1> findByName(String name);
	@Query("select s from Student1 s where s.name=?1 ")
	public List<Student1> findName(String name);
	

}
