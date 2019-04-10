package com.liululee.springsecuritypart4.service.impl;

import com.liululee.springsecuritypart4.domain.UserEntity;
import com.liululee.springsecuritypart4.domain.vo.AuthUserDetails;
import com.liululee.springsecuritypart4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity =  userRepository.findUserEntityByUsername(username);
        return new AuthUserDetails(userEntity);
    }
}
