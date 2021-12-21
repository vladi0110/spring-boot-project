package com.vmarinov.backend.repository;

import com.vmarinov.backend.entity.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecificationRepository extends JpaRepository<Specification, Integer> {

}
