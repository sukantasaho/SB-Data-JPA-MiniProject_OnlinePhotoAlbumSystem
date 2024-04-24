package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Member;

public interface IMemberRepository extends JpaRepository<Member, Integer> 
{

}
