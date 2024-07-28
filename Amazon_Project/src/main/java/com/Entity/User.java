package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	int uid;
	String Uname;
	int age;
	long MobilNo;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobilNo() {
		return MobilNo;
	}
	public void setMobilNo(long mobilNo) {
		MobilNo = mobilNo;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", Uname=" + Uname + ", age=" + age + ", MobilNo=" + MobilNo + "]";
	}
	public User(int uid, String uname, int age, long mobilNo) {
		super();
		this.uid = uid;
		Uname = uname;
		this.age = age;
		MobilNo = mobilNo;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
