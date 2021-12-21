package com.vmarinov.backend.repository;

import com.vmarinov.backend.entity.EuroStandard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EuroStandardRepository extends JpaRepository<EuroStandard, Integer> {

}
