package com.mashitatechnologies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mashitatechnologies.model.Roles;

public interface RoleRepository extends JpaRepository<Roles, Long>{

}
