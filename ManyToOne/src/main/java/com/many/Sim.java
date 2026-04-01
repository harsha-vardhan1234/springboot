package com.many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sim {
	@Id
	private int id;
	private String name;
	@ManyToOne
	private Phone ph;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Phone getPh() {
		return ph;
	}
	public void setPh(Phone ph) {
		this.ph = ph;
	}
	
	

}