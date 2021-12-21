package com.vmarinov.backend.service;

import com.vmarinov.backend.dto.SpecificationDto;

import java.util.List;

public interface SpecificationService {

    List<SpecificationDto> getAll();
}
