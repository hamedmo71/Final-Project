package com.maktab74.finalproject.repository;

import com.maktab74.finalproject.domain.user.Student;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends UserRepository<Student> {

    @Override
    List<Student> findAll(Specification<Student> spec);

    Boolean existsByStudentCode(String studentCode);

    List<Student> findByIsActiveFalse();


}
