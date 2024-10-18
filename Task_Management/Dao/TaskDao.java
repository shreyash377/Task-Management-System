package com.demo.Task_Management.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Task_Management.Entities.Tasks;

public interface TaskDao extends JpaRepository<Tasks, Long> {
	
}
