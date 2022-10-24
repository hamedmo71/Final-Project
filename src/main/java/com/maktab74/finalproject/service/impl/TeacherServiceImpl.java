package com.maktab74.finalproject.service.impl;

import com.maktab74.finalproject.domain.user.Teacher;
import com.maktab74.finalproject.repository.TeacherRepository;
import com.maktab74.finalproject.repository.UserRepository;
import com.maktab74.finalproject.service.TeacherService;
import com.maktab74.finalproject.util.RandomUtil;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TeacherServiceImpl extends UserServiceImpl<Teacher, TeacherRepository>
        implements TeacherService {


    public TeacherServiceImpl(TeacherRepository repository) {
        super(repository);
    }

    @Override
    public Teacher save(Teacher teacher) {
        setCode(teacher);
        return repository.save(teacher);
    }

    private void setCode(Teacher teacher) {
        String employmentYear = String.valueOf(new Date().getYear());
        String code = employmentYear.concat(RandomUtil.getRandomNumeric(5));
        while (repository.existsByPersonnelCode(code)) {
            code = employmentYear.concat(RandomUtil.getRandomNumeric(5));
        }

        teacher.setPersonnelCode(
                code
        );
    }

    @Override
    public List<Teacher> findByIsActiveFalse() {
        return repository.findByIsActiveFalse();
    }
}
