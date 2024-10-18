package com.demo.Task_Management.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;  // Use the correct Id annotation
import jakarta.persistence.Table;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @Column(name = "ClientId", length = 50)
    private long clientid;

    @Column(name = "Name", length = 50)
    private String name;  // Changed from int to String

    @Column(name = "Age", length = 50)
    private int age;

    @Column(name = "Email", length = 50)
    private String email;  // Changed from int to String

    @Column(name = "Address", length = 50)
    private String address;  // Changed from int to String

    @Column(name = "ContactNo", length = 50)
    private long contactno;

	public long getClientid() {
		return clientid;
	}

	public void setClientid(long clientid) {
		this.clientid = clientid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public Client(long clientid, String name, int age, String email, String address, long contactno) {
		super();
		this.clientid = clientid;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
		this.contactno = contactno;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Client [clientid=" + clientid + ", name=" + name + ", age=" + age + ", email=" + email + ", address="
				+ address + ", contactno=" + contactno + "]";
	}

	

}
//}