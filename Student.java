package com.arcus;

public class Student {
	int roll;
	String name;
	public Student(int roll) {
		this.roll=roll;
	}
	public Student(String name) {
		this.name=name;
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public void display_info() {
		System.out.println("Name: "+ name+" Roll: "+roll);
	}

}
