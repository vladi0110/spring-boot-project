package com.vmarinov.backend.service.impl;

import com.vmarinov.backend.dto.DtoFactory;
import com.vmarinov.backend.dto.RightDto;
import com.vmarinov.backend.repository.RightRepository;
import com.vmarinov.backend.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RightServiceImpl implements RightService {

    private final RightRepository rightRepository;

    @Autowired
    public RightServiceImpl(RightRepository rightRepository) {
        this.rightRepository = rightRepository;
    }

    @Override
    public List<RightDto> getAll() {
        return rightRepository.findAll().stream().map(DtoFactory::toDto).collect(Collectors.toList());
    }
}
