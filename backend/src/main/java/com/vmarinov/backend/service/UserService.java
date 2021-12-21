package com.vmarinov.backend.service;

import com.vmarinov.backend.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAll();
}
