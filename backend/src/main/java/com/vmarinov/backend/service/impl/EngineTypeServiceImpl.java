package com.vmarinov.backend.service.impl;

import com.vmarinov.backend.dto.DtoFactory;
import com.vmarinov.backend.dto.EngineTypeDto;
import com.vmarinov.backend.repository.EngineTypeRepository;
import com.vmarinov.backend.service.EngineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EngineTypeServiceImpl implements EngineTypeService {

    private final EngineTypeRepository engineTypeRepository;

    @Autowired
    public EngineTypeServiceImpl(EngineTypeRepository engineTypeRepository) {
        this.engineTypeRepository = engineTypeRepository;
    }

    @Override
    public List<EngineTypeDto> getAll() {
        return engineTypeRepository.findAll().stream().map(DtoFactory::toDto).collect(Collectors.toList());
    }
}
