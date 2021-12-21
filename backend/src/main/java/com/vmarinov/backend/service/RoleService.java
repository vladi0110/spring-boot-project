package com.vmarinov.backend.service;

import com.vmarinov.backend.dto.RoleDto;

import java.util.List;

public interface RoleService {

    List<RoleDto> getAll();
}
