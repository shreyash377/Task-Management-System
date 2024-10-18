package com.demo.Task_Management.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo.Task_Management.Entities.Client;
import com.demo.Task_Management.Services.ClientServices;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controller {

    @Autowired
    private ClientServices clientService;

    // Get all clients
    @GetMapping("/Client")
    public List<Client> getClients() {
        return this.clientService.getClients();    
    }

    // Get a specific client by ID
    @GetMapping("/Client/{clientId}")
    public Client getClient(@PathVariable("clientId") long clientId) {
        return this.clientService.getClient(clientId);
    }

    // Add a new client
    @PostMapping(path = "/Client")
    public Client addClient(@RequestBody Client client) {
        return this.clientService.addClient(client);
    }

    // Update an existing client
    @PutMapping("/Client")
    public Client updateClient(@RequestBody Client client) {
        return this.clientService.updateClient(client);
    }

    // Delete a client by ID
    @DeleteMapping("/Client/{clientId}")
    public ResponseEntity<HttpStatus> deleteClient(@PathVariable("clientId") long clientId) {
        try {
            this.clientService.deleteClient(clientId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
