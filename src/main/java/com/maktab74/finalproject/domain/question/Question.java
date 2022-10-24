package com.maktab74.finalproject.domain.question;

import com.maktab74.finalproject.base.domain.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Question extends BaseEntity<Long> {

    @Column(nullable = false)
    private String questionText;

}
