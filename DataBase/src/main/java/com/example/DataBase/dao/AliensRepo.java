package com.example.DataBase.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DataBase.entity.Alien;

public interface AliensRepo extends JpaRepository<Alien, Integer> {
	
	Alien findById(int id);

}
