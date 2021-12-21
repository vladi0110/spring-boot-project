package com.vmarinov.backend.service.impl;

import com.vmarinov.backend.dto.DtoFactory;
import com.vmarinov.backend.dto.RoleDto;
import com.vmarinov.backend.repository.RoleRepository;
import com.vmarinov.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleDto> getAll() {
        return roleRepository.findAll().stream().map(DtoFactory::toDto).collect(Collectors.toList());
    }
}
