package org.jsp.studentmanagmentsystem;

public class Student {
	private String name;
	private int id;
	private double marks;
	private long mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Student(String name, int id, double marks, long mobile) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.mobile = mobile;
	}
	@Override
	public String toString()
	{
		return name+"\t\t"+id+"\t\t"+marks+"\t\t"+mobile;
	}
}
