package com.demo.Task_Management.Services;

import java.util.List;

import com.demo.Task_Management.Entities.TasksUpdate;

public interface TaskUpdateServices {
	public List<TasksUpdate> getTasksUpdate();
	public TasksUpdate getTasksUpdate(long taskid);
	public TasksUpdate addTasksUpdate(TasksUpdate tasksupdate);
	public TasksUpdate updateTasksUpdate(TasksUpdate tasksupdate);
	public void deleteTasksUpdate(long taskid);
}
