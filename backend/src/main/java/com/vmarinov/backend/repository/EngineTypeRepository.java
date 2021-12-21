package com.vmarinov.backend.repository;

import com.vmarinov.backend.entity.EngineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineTypeRepository extends JpaRepository<EngineType, Integer> {

}
