package com.demo.Task_Management.Dao;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.Task_Management.Entities.Client;

public interface ClientDao extends JpaRepository<Client, Long>{

}
