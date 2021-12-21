package com.vmarinov.backend.service.impl;

import com.vmarinov.backend.dto.DtoFactory;
import com.vmarinov.backend.dto.EuroStandardDto;
import com.vmarinov.backend.repository.EuroStandardRepository;
import com.vmarinov.backend.service.EuroStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EuroStandardServiceImpl implements EuroStandardService {

    private final EuroStandardRepository euroStandardRepository;

    @Autowired
    public EuroStandardServiceImpl(EuroStandardRepository euroStandardRepository) {
        this.euroStandardRepository = euroStandardRepository;
    }

    @Override
    public List<EuroStandardDto> getAll() {
        return euroStandardRepository.findAll().stream().map(DtoFactory::toDto).collect(Collectors.toList());
    }
}
