package com.mashitatechnologies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mashitatechnologies.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
