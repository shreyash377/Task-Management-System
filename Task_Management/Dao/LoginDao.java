package com.demo.Task_Management.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Task_Management.Entities.Login;

public interface LoginDao extends JpaRepository<Login, Long>{

}
