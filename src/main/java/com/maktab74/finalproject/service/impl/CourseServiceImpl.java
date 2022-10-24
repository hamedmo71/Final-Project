package com.maktab74.finalproject.service.impl;

import com.maktab74.finalproject.base.service.impl.BaseEntityServiceImpl;
import com.maktab74.finalproject.domain.Course;
import com.maktab74.finalproject.repository.CourseRepository;
import com.maktab74.finalproject.service.CourseService;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends BaseEntityServiceImpl<Course, Long, CourseRepository>
        implements CourseService {
    public CourseServiceImpl(CourseRepository repository) {
        super(repository);
    }
}
