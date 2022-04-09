package com.vmarinov.backend.service.impl;

import com.vmarinov.backend.controller.tempate.CreateEngineTypeRestTemplate;
import com.vmarinov.backend.dto.DtoFactory;
import com.vmarinov.backend.dto.EngineTypeDto;
import com.vmarinov.backend.entity.EngineType;
import com.vmarinov.backend.error.exceptions.ObjectNotFoundException;
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

    @Override
    public EngineTypeDto getById(int id) {
        EngineType engineType = engineTypeRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("No engine type with id " + id));

        return DtoFactory.toDto(engineType);
    }

    @Override
    public EngineTypeDto getByType(String type) {
        EngineType engineType = engineTypeRepository.findByType(type)
                .orElseThrow(() -> new ObjectNotFoundException("No engine type with type " + type));

        return DtoFactory.toDto(engineType);
    }

    @Override
    public EngineTypeDto createEngineType(CreateEngineTypeRestTemplate template) {
        EngineType engineType = new EngineType();
        engineType.setType(template.getEngineType());

        EngineType created = engineTypeRepository.saveAndFlush(engineType);

        return DtoFactory.toDto(created);
    }
}
