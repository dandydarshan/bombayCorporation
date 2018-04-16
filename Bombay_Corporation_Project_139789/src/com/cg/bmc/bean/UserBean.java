package com.cg.bmc.bean;

public class UserBean {
	private String name;
	private String business;
	private String email;
	private String phone;
	
	public UserBean() {
		
	}
	
	
	
	public UserBean(String name, String business, String email, String phone) {
		super();
		this.name = name;
		this.business = business;
		this.email = email;
		this.phone = phone;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
