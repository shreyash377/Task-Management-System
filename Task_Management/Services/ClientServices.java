package com.demo.Task_Management.Services;

import java.util.List;
import com.demo.Task_Management.Entities.Client;

public interface ClientServices {

	public List<Client> getClients();
	public Client getClient(long Clientid);
	public Client addClient(Client client);
	public Client updateClient(Client client);
	public void deleteClient(long Clientid);
}

