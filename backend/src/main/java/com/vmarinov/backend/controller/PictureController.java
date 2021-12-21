package com.vmarinov.backend.controller;

import com.vmarinov.backend.dto.PictureDto;
import com.vmarinov.backend.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/picture")
public class PictureController {

    private final PictureService pictureService;

    @Autowired
    public PictureController(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @GetMapping(path = "/getByAdvertId/{advertId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PictureDto>> getPicturesByAdvertId(@PathVariable("advertId") int advertId){
        return ResponseEntity.ok(pictureService.getAllByAdvertId(advertId));
    }
}
