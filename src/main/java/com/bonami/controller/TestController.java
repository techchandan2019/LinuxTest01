package com.bonami.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bonami.model.Employee;
import com.bonami.repository.IEmpRepo;

@RestController
public class TestController {
	
	@Autowired
	private IEmpRepo repo;
	
	@GetMapping("/msg/{msg}")
	public String getMessage(@PathVariable String msg) {
		return msg;
	}
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp) {
		
		return repo.save(emp);
	}

}
