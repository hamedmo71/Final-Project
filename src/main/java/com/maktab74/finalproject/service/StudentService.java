package com.maktab74.finalproject.service;

import com.maktab74.finalproject.domain.user.Student;
import com.maktab74.finalproject.service.dto.searchdto.StudentSearch;

import java.util.List;

public interface StudentService extends UserService<Student> {

    List<Student> findByIsActiveFalse();

}
