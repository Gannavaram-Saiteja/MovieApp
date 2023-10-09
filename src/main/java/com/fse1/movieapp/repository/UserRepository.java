package com.fse1.movieapp.repository;

import java.util.Optional;

import com.fse1.movieapp.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    Optional<User> findByLoginId(String username);

    boolean existsByLoginId(String loginId);
}
