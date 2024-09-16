package com.Rajkapoor.demo;

import org.springframework.stereotype.Component;

@Component
public class StudentBean {
	private int roll;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public void disp( ) {
		System.out.println("Student");
	}
	private String sname;
	private String mob;
	private static int x;
	public StudentBean() {
		super();
		System.out.println("Object "+(++x));
	}

}