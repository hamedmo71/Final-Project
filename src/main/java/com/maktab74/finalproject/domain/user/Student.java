package com.maktab74.finalproject.domain.user;

import com.maktab74.finalproject.domain.Course;
import com.maktab74.finalproject.domain.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User {

    private String studentCode;

    private String mobileNumber;

    private String email;

    @ManyToOne
    private Principal principal;

    @ManyToOne
    private Department department;

    @ManyToMany
    @JoinTable (name = "teacher_student_tbl", joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teacher> teachers;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}
