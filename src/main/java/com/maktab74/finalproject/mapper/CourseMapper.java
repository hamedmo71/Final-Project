package com.maktab74.finalproject.mapper;

import com.maktab74.finalproject.base.mapper.BaseMapper;
import com.maktab74.finalproject.domain.Course;
import com.maktab74.finalproject.domain.user.Teacher;
import com.maktab74.finalproject.service.dto.CourseDto;
import com.maktab74.finalproject.service.dto.TeacherRegisterRequestDto;
import com.maktab74.finalproject.service.dto.TeacherRegisterResponseDto;
import org.mapstruct.Mapper;

@Mapper
public interface CourseMapper extends BaseMapper<Course, CourseDto, Long> {

}
