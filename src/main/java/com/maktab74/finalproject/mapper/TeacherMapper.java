package com.maktab74.finalproject.mapper;

import com.maktab74.finalproject.base.mapper.BaseMapper;
import com.maktab74.finalproject.domain.user.Teacher;
import com.maktab74.finalproject.service.dto.TeacherCustomDto;
import com.maktab74.finalproject.service.dto.TeacherRegisterRequestDto;
import com.maktab74.finalproject.service.dto.TeacherRegisterResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher, TeacherRegisterRequestDto, Long> {

    TeacherRegisterResponseDto convertEntityToTeacherRegisterResponseDto(Teacher teacher);

    List<TeacherCustomDto> convertEntityToTeacherCustomDto(List<Teacher> teachers);
}
