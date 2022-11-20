package com.dk.devi.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CollegeDto {

	@Id
	private int rollNo;
	private String name;
	private String loc;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "CollegeDto [rollNo=" + rollNo + ", name=" + name + ", loc=" + loc + "]";
	}
	
}
