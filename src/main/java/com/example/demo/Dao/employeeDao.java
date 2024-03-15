package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modal.EmployeeModal;



@Repository
public interface  employeeDao extends JpaRepository<EmployeeModal,Integer>{

	        
	
	}

