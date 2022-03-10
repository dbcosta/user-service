package com.demo.userservice.repository;

import com.demo.userservice.resource.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
