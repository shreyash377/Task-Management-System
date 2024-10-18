package com.demo.Task_Management.Services;

import java.util.List;

import com.demo.Task_Management.Entities.Tasks;

public interface TaskServices {

	public List<Tasks> getTasks();
	public Tasks getTasks(long taskid);
	public Tasks addTasks(Tasks tasks);
	public Tasks updateTasks(Tasks tasks);
	public void deleteTasks(long taskid);
	
}
