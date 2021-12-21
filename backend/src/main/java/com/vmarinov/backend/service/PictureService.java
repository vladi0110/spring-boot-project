package com.vmarinov.backend.service;

import com.vmarinov.backend.dto.PictureDto;

import java.util.List;

public interface PictureService {

    List<PictureDto> getAllByAdvertId(int advertId);
}
