package com.vmarinov.backend.service;

import com.vmarinov.backend.dto.TransmissionDto;

import java.util.List;

public interface TransmissionService {

    List<TransmissionDto> getAll();
}
