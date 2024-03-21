package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;

@Service
public class BikeServiceimpl implements BikeService{
	
	BikeRepository bikeRepository;
	
	public BikeServiceimpl(BikeRepository bikeRepository) {
		super();
		this.bikeRepository=bikeRepository;
	}

	@Override
	public Bike createBike(Bike bike) {
		
		return bikeRepository.save(bike);
	}

	@Override
	public Bike readBikeByRegNUmber(String registrationNumber) {
		Bike b1=bikeRepository.findById(registrationNumber).get();
		return b1;
//		return null;
	}

	@Override
	public List<Bike> readAllBikes() {
		List<Bike > bikeList=bikeRepository.findAll();
		return bikeList;
	}

	@Override
	public Bike updateBike(Bike bike) {
	
		return bikeRepository.save(bike);
	}

	@Override
	public String deleteBikeByRegNumber(String registrationNumber) {	
		bikeRepository.deleteById(registrationNumber);
				return "Deleted successful";
				
	}

	
}
