package com.vmarinov.backend.service.impl;

import com.vmarinov.backend.dto.DtoFactory;
import com.vmarinov.backend.dto.UserDto;
import com.vmarinov.backend.repository.UserRepository;
import com.vmarinov.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> getAll() {
        return userRepository.findAll().stream().map(DtoFactory::toDto).collect(Collectors.toList());
    }
}
