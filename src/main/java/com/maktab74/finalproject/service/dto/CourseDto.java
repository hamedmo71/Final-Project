package com.maktab74.finalproject.service.dto;

import com.maktab74.finalproject.base.domain.BaseEntity;
import com.maktab74.finalproject.base.dto.BaseDto;
import com.maktab74.finalproject.domain.Department;
import com.maktab74.finalproject.domain.user.Principal;
import com.maktab74.finalproject.domain.user.Student;
import com.maktab74.finalproject.domain.user.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto extends BaseDto<Long> {

    private String title;

    private Date startDate;

    private Date endDate;
}
