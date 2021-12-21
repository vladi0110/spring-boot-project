package com.vmarinov.backend.repository;

import com.vmarinov.backend.entity.Advert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertRepository extends JpaRepository<Advert, Integer> {

}
