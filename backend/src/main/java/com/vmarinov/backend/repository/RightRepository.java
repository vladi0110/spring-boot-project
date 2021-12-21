package com.vmarinov.backend.repository;

import com.vmarinov.backend.entity.Right;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RightRepository extends JpaRepository<Right, Integer> {

}
