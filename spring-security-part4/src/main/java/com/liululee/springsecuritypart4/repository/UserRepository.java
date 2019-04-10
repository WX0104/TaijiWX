package com.liululee.springsecuritypart4.repository;

import com.liululee.springsecuritypart4.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findUserEntityByUsername(String username);

    UserEntity findUserEntityById(Long id);
}
