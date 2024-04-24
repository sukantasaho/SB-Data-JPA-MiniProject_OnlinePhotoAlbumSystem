package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Location;

public interface ILocationRepository extends JpaRepository<Location, Integer>
{

}
