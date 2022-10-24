package com.maktab74.finalproject.domain.user;

import com.maktab74.finalproject.domain.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends Employee {

    private String mobileNumber;

    private String email;

    @ManyToOne
    private Principal principal;

    @ManyToOne
    private Department department;

    @ManyToMany(mappedBy = "teachers")
    private List<Student> students;
}
