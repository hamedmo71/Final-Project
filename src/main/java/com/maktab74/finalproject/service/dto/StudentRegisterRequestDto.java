package com.maktab74.finalproject.service.dto;

import com.maktab74.finalproject.base.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRegisterRequestDto extends BaseDto<Long> {

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String Role;

    private String mobileNumber;

    private String email;
}
