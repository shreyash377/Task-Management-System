package com.demo.Task_Management.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo.Task_Management.Entities.Login;
import com.demo.Task_Management.Services.LoginServices;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController 
public class LoginController {

	 @Autowired
	    private LoginServices loginServices;

	    // Get all clients
	    @GetMapping("/Login")
	    public List<Login> getLogin() {
	        return this.loginServices.getLogin();    
	    }

	    // Get a specific client by ID
	    @GetMapping("/Login/{loginId}")
	    public Login getLogin(@PathVariable("loginId") long loginId) {
	        return this.loginServices.getLogin(loginId);
	    }

	    // Add a new client
	    @PostMapping(path = "/Login")
	    public Login addClient(@RequestBody Login login) {
	        return this.loginServices.addLogin(login);
	    }

	    // Update an existing client
	    @PutMapping("/Login")
	    public Login updateLogin(@RequestBody Login login) {
	        return this.loginServices.updateLogin(login);
	    }

	    // Delete a client by ID
	    @DeleteMapping("/Login/{loginId}")
	    public ResponseEntity<HttpStatus> deleteClient(@PathVariable("loginId") long loginId) {
	        try {
	            this.loginServices.deleteLogin(loginId);
	            return new ResponseEntity<>(HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
