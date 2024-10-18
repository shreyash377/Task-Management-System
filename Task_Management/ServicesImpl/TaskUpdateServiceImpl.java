package com.demo.Task_Management.ServicesImpl;

import org.springframework.stereotype.Service;
import com.demo.Task_Management.Dao.*;
import com.demo.Task_Management.Entities.TasksUpdate;
import com.demo.Task_Management.Services.TaskUpdateServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TaskUpdateServiceImpl implements TaskUpdateServices {

	@Autowired    //Automatecally connect db
	private TaskUpdateDao taskupdateDao;

	@Override
	public List<TasksUpdate> getTasksUpdate()    //retrieve all courses
	{
		return taskupdateDao.findAll();
	}

	@Override
	public TasksUpdate getTasksUpdate(long taskId) //course with id
	{
		return taskupdateDao.getOne(taskId);
	}

	@Override   //annotation  
	public TasksUpdate addTasksUpdate(TasksUpdate tasksupdate)
	{
		taskupdateDao.save(tasksupdate);
		return tasksupdate;
	}

	@Override
	public TasksUpdate updateTasksUpdate(TasksUpdate tasksupdate )
	{
		taskupdateDao.save(tasksupdate );
		return tasksupdate ;
	}

	@Override
	public void deleteTasksUpdate(long parselong)
	{
		TasksUpdate c= taskupdateDao.getOne(parselong);
		taskupdateDao.delete(c);

	}
}
