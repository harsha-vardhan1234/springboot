package com.pentagon.Spring_database_project;

import java.util.List;

public class ResponseStructre<T> {
	private int statuscode;
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	private String message;
	private List<T> data;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
//	public T getData() {
//		return data;
//	}
//	public void setData(T data) {
//		this.data = data;
//	}
//	public List<Student1> findByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

}
