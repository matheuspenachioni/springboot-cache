package com.springcache.math.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcache.math.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
