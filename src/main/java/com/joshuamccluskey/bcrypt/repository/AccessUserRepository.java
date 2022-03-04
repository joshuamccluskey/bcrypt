package com.joshuamccluskey.bcrypt.repository;

import com.joshuamccluskey.bcrypt.model.AccessUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessUserRepository extends JpaRepository<AccessUser, Long> {
    AccessUser findByUsername(String username);
}
