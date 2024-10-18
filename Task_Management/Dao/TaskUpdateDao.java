package com.demo.Task_Management.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Task_Management.Entities.TasksUpdate;

public interface TaskUpdateDao extends JpaRepository<TasksUpdate, Long>{

}
