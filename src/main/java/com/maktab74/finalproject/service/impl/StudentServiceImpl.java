package com.maktab74.finalproject.service.impl;

import com.maktab74.finalproject.domain.user.Student;
import com.maktab74.finalproject.repository.StudentRepository;
import com.maktab74.finalproject.service.StudentService;
import com.maktab74.finalproject.util.RandomUtil;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl extends UserServiceImpl<Student, StudentRepository>
        implements StudentService {

    public StudentServiceImpl(StudentRepository repository) {
        super(repository);
    }

    @Override
    public Student save(Student student) {
        setStudentCode(student);
        return repository.save(student);
    }

    public void setStudentCode(Student student) {
        String entranceYear = String.valueOf(new Date().getYear());
        String studentCode = entranceYear.concat(RandomUtil.getRandomNumeric(6));
        while (repository.existsByStudentCode(studentCode)) {
            studentCode = entranceYear.concat(RandomUtil.getRandomNumeric(6));
        }
        student.setStudentCode(studentCode);
    }

    @Override
    public List<Student> findByIsActiveFalse() {
        return repository.findByIsActiveFalse();
    }
}
