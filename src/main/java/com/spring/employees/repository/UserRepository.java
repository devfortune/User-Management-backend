package com.spring.employees.repository;

import com.spring.employees.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {  // <Object of the class we want to manage, type of primary key>
    User findUserByUsername(String username);  // Jpa builds SQL query from this
    User findUserByEmail(String email);
}
