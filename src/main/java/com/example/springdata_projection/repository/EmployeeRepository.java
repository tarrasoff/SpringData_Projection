package com.example.springdata_projection.repository;

import com.example.springdata_projection.entity.Employee;
import com.example.springdata_projection.projection.EmployeeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<EmployeeProjection> findAllBy();
}