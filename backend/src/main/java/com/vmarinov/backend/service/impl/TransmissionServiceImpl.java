package com.vmarinov.backend.service.impl;

import com.vmarinov.backend.dto.DtoFactory;
import com.vmarinov.backend.dto.TransmissionDto;
import com.vmarinov.backend.repository.TransmissionRepository;
import com.vmarinov.backend.service.TransmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransmissionServiceImpl implements TransmissionService {

    private final TransmissionRepository transmissionRepository;

    @Autowired
    public TransmissionServiceImpl(TransmissionRepository transmissionRepository) {
        this.transmissionRepository = transmissionRepository;
    }

    @Override
    public List<TransmissionDto> getAll() {
        return transmissionRepository.findAll().stream().map(DtoFactory::toDto).collect(Collectors.toList());
    }
}
