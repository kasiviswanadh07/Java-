package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bike;

public interface BikeService {
//   Create and store Bike Object 
	Bike createBike(Bike bike);
//	Read Bike for a specific regNumber
	Bike readBikeByRegNUmber(String registrationNumber);
//	Read all the bike 
	List<Bike> readAllBikes();
//	update the bike
	Bike updateBike(Bike bike);
//	Delete the bike
	String deleteBikeByRegNumber(String registrationNumber);
}
