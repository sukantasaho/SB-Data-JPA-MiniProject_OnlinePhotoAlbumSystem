package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Photo;

public interface IPhotoRepository extends JpaRepository<Photo, Integer>
{

}
