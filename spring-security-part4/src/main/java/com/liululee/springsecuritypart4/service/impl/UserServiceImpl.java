package com.liululee.springsecuritypart4.service.impl;

import com.liululee.springsecuritypart4.domain.UserEntity;
import com.liululee.springsecuritypart4.repository.UserRepository;
import com.liululee.springsecuritypart4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity getUserEntity(Long id) {
      return userRepository.findUserEntityById(id);
    }
}
