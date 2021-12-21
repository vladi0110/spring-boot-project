package com.vmarinov.backend.controller;

import com.vmarinov.backend.dto.EngineTypeDto;
import com.vmarinov.backend.service.EngineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/engineType")
public class EngineTypeController {

    private final EngineTypeService engineTypeService;

    @Autowired
    public EngineTypeController(EngineTypeService engineTypeService) {
        this.engineTypeService = engineTypeService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<EngineTypeDto>> getAllEngineTypes(){
            return ResponseEntity.ok(engineTypeService.getAll());
    }
}
