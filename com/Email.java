package com;

public class Email 
{
	private String username;
	private String password;
	private String emailId;
	
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Email(String username, String password, String emailId) {
		super();
		this.username = username;
		this.password = password;
		this.emailId = emailId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "Email [username=" + username + ", password=" + password + ", emailId=" + emailId + "]";
	}
	
	
}
