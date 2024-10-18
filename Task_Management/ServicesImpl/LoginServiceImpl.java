package com.demo.Task_Management.ServicesImpl;

import org.springframework.stereotype.Service;
import com.demo.Task_Management.Dao.*;
import com.demo.Task_Management.Entities.Login;
import com.demo.Task_Management.Services.LoginServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LoginServiceImpl implements LoginServices{

	@Autowired    //Automatecally connect db
	private LoginDao loginDao;

	@Override
	public List<Login> getLogin()    //retrieve all courses
	{
		return loginDao.findAll();
	}

	@Override
	public Login getLogin(long logintId) //course with id
	{
		return loginDao.getOne(logintId);
	}

	@Override   //annotation  
	public Login addLogin(Login login)
	{
		loginDao.save(login);
		return login;
	}

	@Override
	public Login updateLogin(Login login )
	{
		loginDao.save(login );
		return login ;
	}

	@Override
	public void deleteLogin(long parselong)
	{
		Login c= loginDao.getOne(parselong);
		loginDao.delete(c);

	}
}
