package com.maktab74.finalproject.mapper;

import com.maktab74.finalproject.base.mapper.BaseMapper;
import com.maktab74.finalproject.domain.user.Student;
import com.maktab74.finalproject.domain.user.Teacher;
import com.maktab74.finalproject.service.dto.StudentCustomDto;
import com.maktab74.finalproject.service.dto.StudentRegisterRequestDto;
import com.maktab74.finalproject.service.dto.StudentRegisterResponseDto;
import com.maktab74.finalproject.service.dto.TeacherCustomDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student, StudentRegisterRequestDto, Long> {

    StudentRegisterResponseDto convertEntityToStudentRegisterResponseDto(Student student);

    List<StudentCustomDto> convertEntityToCustomCustomDto(List<Student> students);

}
