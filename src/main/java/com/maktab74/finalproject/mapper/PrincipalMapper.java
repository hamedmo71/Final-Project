package com.maktab74.finalproject.mapper;

import com.maktab74.finalproject.base.mapper.BaseMapper;
import com.maktab74.finalproject.domain.user.Principal;
import com.maktab74.finalproject.service.dto.PrincipalRegisterRequestDto;
import org.mapstruct.Mapper;

@Mapper
public interface PrincipalMapper extends BaseMapper<Principal, PrincipalRegisterRequestDto, Long> {
}
