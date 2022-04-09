package com.vmarinov.backend.service;

import com.vmarinov.backend.controller.tempate.CreateEngineTypeRestTemplate;
import com.vmarinov.backend.dto.EngineTypeDto;

import java.util.List;

public interface EngineTypeService {

    List<EngineTypeDto> getAll();

    EngineTypeDto getById(int id);

    EngineTypeDto getByType(String type);

    EngineTypeDto createEngineType(CreateEngineTypeRestTemplate template);
}
