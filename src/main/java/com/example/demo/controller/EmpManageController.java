package com.example.demo.controller;

import java.awt.Dialog.ModalExclusionType;
import java.lang.ProcessBuilder.Redirect;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Dao.employeeDao;
import com.example.demo.Modal.EmployeeModal;
import com.example.demo.Service.EmployeeService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpManageController {

	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/")
	public String signin(Model m) {
		return "signin";
	}

	@PostMapping("/login")
	public String singin(@ModelAttribute EmployeeModal employee) {

		if (employeeservice.findEmployeee(employee))
			return "redirect:/home";
		else
			return "errorNotAdded";
	}

	@GetMapping("/logout")
	public String logout(Model m) {
		return "redirect:/";
	}

	@GetMapping("/home")
	public String home(Model m) {

		List<EmployeeModal> employees = employeeservice.getAllEmployee();
		m.addAttribute("employees", employees);
		return "index";
	}

	@GetMapping("/addemp")
	public String addEmpForm() {
		return "addemp";
	}

	@PostMapping("/register")
	public String empRegister(@ModelAttribute EmployeeModal employee) {

		employeeservice.addEmployee(employee);
		System.out.print(employee);
		return "redirect:/";

	}

	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeservice.deleteEmployee(id);
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String editEmployee(@PathVariable int id, Model m) {
		EmployeeModal employee = employeeservice.getEMpById(id);
		System.out.println(employee + "in controler");
		m.addAttribute("employees", employee);
		return "edit_emp";

	}

}
