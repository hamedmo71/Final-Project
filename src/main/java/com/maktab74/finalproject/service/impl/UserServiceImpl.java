package com.maktab74.finalproject.service.impl;

import com.maktab74.finalproject.base.service.impl.BaseEntityServiceImpl;
import com.maktab74.finalproject.domain.user.User;
import com.maktab74.finalproject.repository.UserRepository;
import com.maktab74.finalproject.service.UserService;
import com.maktab74.finalproject.service.dto.searchdto.UserSearch;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl<T extends User, R extends UserRepository<T>> extends BaseEntityServiceImpl<T, Long, R>
        implements UserService<T> {


    public UserServiceImpl(R repository) {
        super(repository);
    }

    @Override
    public T findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public List<T> findAll(UserSearch userSearch) {
        return repository.findAll((root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            setFirstName(predicates, root, criteriaBuilder, userSearch.getFirstName());
            setLastName(predicates, root, criteriaBuilder, userSearch.getLastName());
            setRole(predicates, root, criteriaBuilder, userSearch.getRole());
            return criteriaBuilder.and(
                    predicates.toArray(new Predicate[0])
            );
        });
    }

    private void setFirstName(List<Predicate> predicates, Root<T> root,
                              CriteriaBuilder criteriaBuilder, String firstName) {
        if (firstName!=null && !firstName.isBlank()){
            predicates.add(
                    criteriaBuilder.like(
                            root.get("lastName"),
                            "%" + firstName + "%"
                    )
            );
        }
    }

    private void setLastName(List<Predicate> predicates, Root<T> root,
                             CriteriaBuilder criteriaBuilder, String lastName) {
        if (lastName!=null && !lastName.isBlank()){
            predicates.add(
                    criteriaBuilder.like(
                            root.get("lastName"),
                            "%" + lastName + "%"
                    )
            );
        }
    }

    private void setRole(List<Predicate> predicates, Root<T> root,
                         CriteriaBuilder criteriaBuilder, String role) {
        if (role!=null && !role.isBlank()){
            predicates.add(
                    criteriaBuilder.equal(
                            root.get("role"),role
                    )
            );
        }
    }
}


