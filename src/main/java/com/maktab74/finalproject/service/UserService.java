package com.maktab74.finalproject.service;

import com.maktab74.finalproject.base.service.BaseEntityService;
import com.maktab74.finalproject.domain.user.Teacher;
import com.maktab74.finalproject.domain.user.User;
import com.maktab74.finalproject.service.dto.searchdto.TeacherSearch;
import com.maktab74.finalproject.service.dto.searchdto.UserSearch;

import java.util.List;

public interface UserService<T extends User> extends BaseEntityService<T, Long> {

    T findByUsername(String username);

    List<T> findAll(UserSearch userSearch);


}
