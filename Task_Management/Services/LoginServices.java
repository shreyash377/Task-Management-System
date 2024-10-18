package com.demo.Task_Management.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.demo.Task_Management.Entities.Login;

@Service
public interface LoginServices {
	
	public List<Login> getLogin();
	public Login getLogin(long Loginid);
	public Login addLogin(Login login);
	public Login updateLogin(Login login);
	public void deleteLogin(long Loginid);
}
