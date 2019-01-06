package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
