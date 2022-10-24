package com.maktab74.finalproject.domain;

import com.maktab74.finalproject.base.domain.BaseEntity;
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

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Course extends BaseEntity<Long> {

    @Column(name = "course_title", nullable = false)
    private String title;

    @Column(name = "unique_id_of_the_course", nullable = false)
    private String courseUniqueId;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date endDate;

    @ManyToOne
    private Principal principal;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Department department;

    @ManyToMany
    @JoinTable(name = "student_course_tbl", joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

}
