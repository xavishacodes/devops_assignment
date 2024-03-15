package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Modal.EmployeeModal;

import com.example.demo.Dao.employeeDao;

@Service
public class EmployeeService {

	@Autowired
	private employeeDao employeedao;
	
	public void addEmployee(EmployeeModal e)
	{
		employeedao.save(e);
	}
	
	public List<EmployeeModal> getAllEmployee()
	{
		
		return employeedao.findAll();
	}
	
	public void deleteEmployee(int id)
	{
		employeedao.deleteById(id);
	}
	
	public EmployeeModal getEMpById(int id) {
         Optional<EmployeeModal> employeeModal = employeedao.findById(id);
         
         if(employeeModal.isPresent())
         {
        	 return employeeModal.get();
        	 
         }
         
         return null;
	}
	
}
