package com.vmarinov.backend.repository;

import com.vmarinov.backend.entity.EngineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EngineTypeRepository extends JpaRepository<EngineType, Integer> {

    Optional<EngineType> findByType(String type);

}
