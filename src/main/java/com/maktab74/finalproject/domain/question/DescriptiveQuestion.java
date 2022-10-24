package com.maktab74.finalproject.domain.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DescriptiveQuestion extends Question {

    @Column(nullable = false)
    private String answer;
}
