package com.demo.Task_Management.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo.Task_Management.Entities.Tasks;
import com.demo.Task_Management.Services.TaskServices;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController 
public class TaskController {

	  @Autowired
	    private  TaskServices taskService;

	    // Get all clients
	    @GetMapping("/Tasks")
	    public List<Tasks> getTasks() {
	        return this. taskService.getTasks();    
	    }

	    // Get a specific client by ID
	    @GetMapping("/Tasks/{TaskId}")
	    public Tasks getTasks(@PathVariable("taskId") long taskId) {
	        return this.taskService.getTasks(taskId);
	    }

	    // Add a new client
	    @PostMapping(path = "/Tasks")
	    public Tasks addTasks(@RequestBody Tasks tasks) {
	        return this.taskService.addTasks(tasks);
	    }

	    // Update an existing client
	    @PutMapping("/Tasks")
	    public Tasks updateTasks(@RequestBody Tasks tasks) {
	        return this.taskService.updateTasks(tasks);
	    }

	    // Delete a client by ID
	    @DeleteMapping("/Tasks/{taskId}")
	    public ResponseEntity<HttpStatus> deleteTasks(@PathVariable("taskId") long taskId) {
	        try {
	            this.taskService.deleteTasks(taskId);
	            return new ResponseEntity<>(HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
