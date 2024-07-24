package com.hb;

public class Vechicle {
	
	int id;
	String name;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vechicle [id=" + id + ", name=" + name + "]";
	}
	public Vechicle(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public Vechicle() {
	}
	
	
	
	
	

}
