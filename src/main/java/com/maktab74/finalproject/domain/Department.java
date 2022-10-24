package com.maktab74.finalproject.domain;

import com.maktab74.finalproject.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Department extends BaseEntity<Long> {

    private String name;

    private String phoneNumber;

}
