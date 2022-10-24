package com.maktab74.finalproject.repository;

import com.maktab74.finalproject.domain.user.Teacher;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends UserRepository<Teacher> {

    @Override
    List<Teacher> findAll(Specification<Teacher> spec);

    Boolean existsByPersonnelCode(String personnelCode);

    List<Teacher> findByIsActiveFalse();
}
