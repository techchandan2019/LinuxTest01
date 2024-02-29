package com.bonami.repository;

import org.springframework.data.repository.CrudRepository;

import com.bonami.model.Employee;

public interface IEmpRepo extends CrudRepository<Employee, Integer> {

	
}
