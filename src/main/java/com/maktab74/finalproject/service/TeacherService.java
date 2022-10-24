package com.maktab74.finalproject.service;

import com.maktab74.finalproject.base.service.BaseEntityService;
import com.maktab74.finalproject.domain.user.Teacher;
import com.maktab74.finalproject.service.dto.searchdto.TeacherSearch;

import java.util.List;

public interface TeacherService extends UserService<Teacher> {

    List<Teacher> findByIsActiveFalse();

}
