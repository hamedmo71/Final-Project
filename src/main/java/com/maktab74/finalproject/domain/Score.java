package com.maktab74.finalproject.domain;

import com.maktab74.finalproject.base.domain.BaseEntity;
import com.maktab74.finalproject.domain.user.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Score extends BaseEntity<Long> {

    private Double score;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Exam exam;
}
