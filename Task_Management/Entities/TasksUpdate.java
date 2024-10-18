package com.demo.Task_Management.Entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TasksUpdate")
public class TasksUpdate {
	@Id
	@Column(name ="TaskId", length = 50)
	private long taskid;

	@Column(name ="DeleteTask", length = 50)
	private String deletetask;

	@Column(name ="AddTask", length = 50)
	private String addtask;

	public long getTaskid() {
		return taskid;
	}

	public void setTaskid(long taskid) {
		this.taskid = taskid;
	}

	public String getDeletetask() {
		return deletetask;
	}

	public void setDeletetask(String deletetask) {
		this.deletetask = deletetask;
	}

	public String getAddtask() {
		return addtask;
	}

	public void setAddtask(String addtask) {
		this.addtask = addtask;
	}

	public TasksUpdate(long taskid, String deletetask, String addtask) {
		super();
		this.taskid = taskid;
		this.deletetask = deletetask;
		this.addtask = addtask;
	}

	public TasksUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TasksUpdate [taskid=" + taskid + ", deletetask=" + deletetask + ", addtask=" + addtask + "]";
	}

	
	
}
