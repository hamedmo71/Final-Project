package com.maktab74.finalproject.service.dto;

import com.maktab74.finalproject.base.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentCustomDto extends BaseDto<Long> {

    private String firstName;

    private String lastName;

    private String mobileNumber;

    private String email;
}
