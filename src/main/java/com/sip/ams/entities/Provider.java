package com.sip.ams.entities;

public class Provider {
	private int id;
	private String label;
	private String email;
	private String address;

	public Provider(int id, String label, String email, String address) {
		super();
		this.id = id;
		this.label = label;
		this.email = email;
		this.address = address;
	}

	public Provider() {
		super();
		
	}
	@Override
	public String toString() {
		return "Provider [id=" + id + ", label=" + label + ", email=" + email + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
