package com.demo.Task_Management.ServicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.demo.Task_Management.Dao.*;
import com.demo.Task_Management.Entities.Client;
import com.demo.Task_Management.Services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClientServiceImpl implements ClientServices  {
	
	@Autowired    //Automatecally connect db
	private ClientDao clientDao;

	@Override
	public List<Client> getClients()    //retrieve all courses
	{
		return clientDao.findAll();
	}

	@Override
	public Client getClient(long clientId) //course with id
	{
		return clientDao.getOne(clientId);
	}

	@Override   //annotation  
	public Client addClient(Client client)
	{
		clientDao.save(client);
		return client;
	}

	@Override
	public Client updateClient(Client  client )
	{
		clientDao.save(client);
		return client;
	}

	@Override
	public void deleteClient(long parselong)
	{
		Client  c=clientDao.getOne(parselong);
		clientDao.delete(c);

	}
}
