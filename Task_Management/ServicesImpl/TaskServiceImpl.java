package com.demo.Task_Management.ServicesImpl;


import org.springframework.stereotype.Service;
import com.demo.Task_Management.Dao.*;
import com.demo.Task_Management.Entities.Tasks;
import com.demo.Task_Management.Services.TaskServices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TaskServiceImpl  implements TaskServices {

	@Autowired    //Automatecally connect db
	private TaskDao taskDao;

	@Override
	public List<Tasks> getTasks()    //retrieve all courses
	{
		return taskDao.findAll();
	}

	@Override
	public Tasks getTasks(long taskid) //course with id
	{
		return taskDao.getOne(taskid);
	}

	@Override   //annotation  
	public Tasks addTasks(Tasks tasks)
	{
		taskDao.save(tasks);
		return tasks;
	}

	@Override
	public Tasks updateTasks(Tasks tasks )
	{
		taskDao.save(tasks );
		return tasks ;
	}

	@Override
	public void deleteTasks(long parselong)
	{
		Tasks c= taskDao.getOne(parselong);
		taskDao.delete(c);

	}
}
