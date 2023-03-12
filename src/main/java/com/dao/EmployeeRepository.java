package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

	EmployeeEntity findByName(String name);
}
