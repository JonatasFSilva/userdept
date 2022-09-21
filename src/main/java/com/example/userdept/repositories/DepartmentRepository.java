package com.example.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userdept.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
