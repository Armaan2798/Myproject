package org.jsp.PhoneSimulatorServelet.dto;

import java.io.Serializable;

public class Phone implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Name;
	private String  Number;
	private String emailId;
	private String DOB;
	public Phone() {
		super();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Phone [Name=" + Name + ", Number=" + Number + ", emailId=" + emailId + ", DOB=" + DOB + "]";
	}
	
	
	
	
	

}
