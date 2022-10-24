package com.maktab74.finalproject.service.impl;

import com.maktab74.finalproject.base.service.impl.BaseEntityServiceImpl;
import com.maktab74.finalproject.domain.user.Principal;
import com.maktab74.finalproject.repository.PrincipalRepository;
import com.maktab74.finalproject.service.PrincipalService;
import org.springframework.stereotype.Service;

@Service
public class PrincipalServiceImpl extends BaseEntityServiceImpl<Principal, Long, PrincipalRepository>
        implements PrincipalService {
    public PrincipalServiceImpl(PrincipalRepository repository) {
        super(repository);
    }
}
