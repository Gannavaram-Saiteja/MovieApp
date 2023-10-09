package com.fse1.movieapp.repository;

import java.util.Optional;

import com.fse1.movieapp.models.ERole;
import com.fse1.movieapp.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}