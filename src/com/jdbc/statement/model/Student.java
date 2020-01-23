package com.jdbc.statement.model;

public class Student {
	private int id;
	private String name ;
	private String mobno;
	private String city;
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
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String toString() 
	{
		return getId()+"\t"+getName()+"\t"+getMobno()+"\t"+getCity();
		
	}
	
}
