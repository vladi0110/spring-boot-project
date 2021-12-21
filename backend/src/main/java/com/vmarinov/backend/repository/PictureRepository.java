package com.vmarinov.backend.repository;

import com.vmarinov.backend.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Integer> {

    List<Picture> findByAdvert_Id(int advertId);

}
