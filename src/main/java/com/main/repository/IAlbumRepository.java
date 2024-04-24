package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Album;

public interface IAlbumRepository extends JpaRepository<Album, Integer> 
{

}
