package com.maktab74.finalproject.domain.question;

import com.maktab74.finalproject.base.domain.BaseEntity;
import com.maktab74.finalproject.domain.Exam;
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
public class ExamQuestions extends BaseEntity<Long> {

    private Double questionScore;

    @ManyToOne
    private Exam exam;

    @ManyToOne
    private Question question;
}
