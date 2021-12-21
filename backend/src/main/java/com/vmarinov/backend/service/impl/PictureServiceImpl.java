package com.vmarinov.backend.service.impl;

import com.vmarinov.backend.dto.DtoFactory;
import com.vmarinov.backend.dto.PictureDto;
import com.vmarinov.backend.entity.Picture;
import com.vmarinov.backend.repository.PictureRepository;
import com.vmarinov.backend.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PictureServiceImpl implements PictureService {

    private final PictureRepository pictureRepository;

    @Autowired
    public PictureServiceImpl(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    @Override
    public List<PictureDto> getAllByAdvertId(int advertId) {
        return pictureRepository.findByAdvert_Id(advertId).stream().map(DtoFactory::toDto).collect(Collectors.toList());
    }
}
