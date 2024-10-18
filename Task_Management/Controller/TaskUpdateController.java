package com.demo.Task_Management.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo.Task_Management.Entities.TasksUpdate;
import com.demo.Task_Management.Services.TaskUpdateServices;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController 
public class TaskUpdateController {
 

	  @Autowired
	    private  TaskUpdateServices taskupdateService;

	    // Get all clients
	    @GetMapping("/TasksUpdate")
	    public List<TasksUpdate> getTasksUpdate() {
	        return this. taskupdateService.getTasksUpdate();    
	    }

	    // Get a specific client by ID
	    @GetMapping("/TasksUpdate/{TaskId}")
	    public TasksUpdate getTasks(@PathVariable("taskId") long taskId) {
	        return this.taskupdateService.getTasksUpdate(taskId);
	    }

	    // Add a new client
	    @PostMapping(path = "/TasksUpdate")
	    public TasksUpdate addTasksUpdate(@RequestBody TasksUpdate tasksupdate) {
	        return this.taskupdateService.addTasksUpdate(tasksupdate);
	    }

	    // Update an existing client
	    @PutMapping("/TasksUpdate")
	    public TasksUpdate updateTasksUpdate(@RequestBody TasksUpdate tasks) {
	        return this.taskupdateService.updateTasksUpdate(tasks);
	    }

	    // Delete a client by ID
	    @DeleteMapping("/TasksUpdate/{taskId}")
	    public ResponseEntity<HttpStatus> deleteTasks(@PathVariable("taskId") long taskId) {
	        try {
	            this.taskupdateService.deleteTasksUpdate(taskId);
	            return new ResponseEntity<>(HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
