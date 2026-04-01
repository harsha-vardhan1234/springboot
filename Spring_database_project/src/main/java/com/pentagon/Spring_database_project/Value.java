package com.pentagon.Spring_database_project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Value {
	@Id
	private int id;
	private String interest;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
