package com.tommy.fsd.repo;

import com.tommy.fsd.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
    Collection<User> findAllByRole(String role);
    List<User> findAll();
}
