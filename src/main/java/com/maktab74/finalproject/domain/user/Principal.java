package com.maktab74.finalproject.domain.user;

import com.maktab74.finalproject.domain.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Principal extends Employee {

    @OneToOne
    private Department department;

}
