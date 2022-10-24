package com.maktab74.finalproject.repository;

import com.maktab74.finalproject.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface UserRepository<T extends User> extends JpaRepository<T, Long>,
        JpaSpecificationExecutor<T> {

    T findByUsername(String username);

    <P> List<P> findByRole(String Role, Class<P> pClass);
}
