package com.example.app_employee.repository;

import com.example.app_employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRepository extends JpaRepository<Employee,Long> {

    Optional<Employee> findEmplyeeById(Long id);
}
