package com.maktab74.finalproject.domain;

import com.maktab74.finalproject.base.domain.BaseEntity;
import com.maktab74.finalproject.domain.user.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Exam extends BaseEntity<Long> {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date examDate;

    @Column(nullable = false)
    private Integer totalExamScore;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Course course;


}
