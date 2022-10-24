package com.maktab74.finalproject.domain.question;

import com.maktab74.finalproject.base.domain.BaseEntity;
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
public class MultipleChoiceQuestionOptions extends BaseEntity<Long> {

    private Boolean isTrue;

    @ManyToOne
    private MultipleChoiceQuestion multipleChoiceQuestion;

}
