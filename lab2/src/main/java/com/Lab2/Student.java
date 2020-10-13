package com.Lab2;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private String name;
	private String surname;
	private String department;
	
	Student(){};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}