package com.vmarinov.backend.controller;

import com.vmarinov.backend.controller.tempate.CreateEngineTypeRestTemplate;
import com.vmarinov.backend.dto.EngineTypeDto;
import com.vmarinov.backend.service.EngineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/engineType")
public class EngineTypeController {

    private final EngineTypeService engineTypeService;

    @Autowired
    public EngineTypeController(EngineTypeService engineTypeService) {
        this.engineTypeService = engineTypeService;
    }

    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EngineTypeDto>> getAllEngineTypes(){
            return ResponseEntity.ok(engineTypeService.getAll());
    }

    @GetMapping(path = "/getBy/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EngineTypeDto> getById(@PathVariable("id") int id){
        return ResponseEntity.ok(engineTypeService.getById(id));
    }

    @GetMapping(path = "/getBy/type/{type}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EngineTypeDto> getByType(@PathVariable("type") String type){
        return ResponseEntity.ok(engineTypeService.getByType(type));
    }

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EngineTypeDto> create(@RequestBody @Valid CreateEngineTypeRestTemplate template){
        return ResponseEntity.ok(engineTypeService.createEngineType(template));
    }
}
