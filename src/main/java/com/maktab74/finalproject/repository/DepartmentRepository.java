package com.maktab74.finalproject.repository;

import com.maktab74.finalproject.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
