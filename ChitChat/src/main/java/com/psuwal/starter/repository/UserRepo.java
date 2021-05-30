package com.psuwal.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psuwal.starter.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
