package com.vmarinov.backend.service.impl;

import com.vmarinov.backend.dto.DtoFactory;
import com.vmarinov.backend.dto.SpecificationDto;
import com.vmarinov.backend.repository.SpecificationRepository;
import com.vmarinov.backend.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpecificationServiceImpl implements SpecificationService {

    private final SpecificationRepository specificationRepository;

    @Autowired
    public SpecificationServiceImpl(SpecificationRepository specificationRepository) {
        this.specificationRepository = specificationRepository;
    }

    @Override
    public List<SpecificationDto> getAll() {
        return specificationRepository.findAll().stream().map(DtoFactory::toDto).collect(Collectors.toList());
    }
}
