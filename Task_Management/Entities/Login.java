package com.demo.Task_Management.Entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login")
public class Login {
	
	@Id
	@Column(name ="LoginId", length = 50)
	private long loginid;

	@Column(name ="Password", length = 50)
	private long password;

	public long getLoginid() {
		return loginid;
	}

	public void setLoginid(long loginid) {
		this.loginid = loginid;
	}

	public long getPassword() {
		return password;
	}

	public void setPassword(long password) {
		this.password = password;
	}

	public Login(long loginid, long password) {
		super();
		this.loginid = loginid;
		this.password = password;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Login [loginid=" + loginid + ", password=" + password + "]";
	}

	
	
}