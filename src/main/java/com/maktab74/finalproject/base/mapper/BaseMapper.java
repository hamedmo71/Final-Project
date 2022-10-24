package com.maktab74.finalproject.base.mapper;

import com.maktab74.finalproject.base.domain.BaseEntity;
import com.maktab74.finalproject.base.dto.BaseDto;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<E extends BaseEntity<ID>, D extends BaseDto<ID>, ID extends Serializable> {

    E convertDTOToEntity(D d);

    D convertEntityToDTO(E e);

    List<E> convertListDTOToEntityList(List<D> dtoList);

    List<D> convertListEntityToDTOList(List<E> entityList);
}
