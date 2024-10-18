package com.demo.Task_Management.Entities;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Tasks")
public class Tasks {
	@Id
	@Column(name ="TaskId", length = 50)
	private long taskid;

	@Column(name ="TaskName", length = 50)
	private String taskname;

	@Column(name ="Taskdate", length = 50)
	private long taskdate;

	public long getTaskid() {
		return taskid;
	}

	public void setTaskid(long taskid) {
		this.taskid = taskid;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public long getTaskdate() {
		return taskdate;
	}

	public void setTaskdate(long taskdate) {
		this.taskdate = taskdate;
	}

	public Tasks(long taskid, String taskname, long taskdate) {
		super();
		this.taskid = taskid;
		this.taskname = taskname;
		this.taskdate = taskdate;
	}

	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tasks [taskid=" + taskid + ", taskname=" + taskname + ", taskdate=" + taskdate + "]";
	}

	
	
}
