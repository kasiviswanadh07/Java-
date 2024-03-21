package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.service.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController {
	
	BikeService bikeService;
	
	public BikeController(BikeService bikeService) {
		super();
		this.bikeService=bikeService;
	}
	@PostMapping
	public Bike createBike(@RequestBody Bike bike) {
		
		return bikeService.createBike(bike);
	}
	@GetMapping("{registrationNumber}")
	public Bike getBikeId(@PathVariable String registrationNumber) {
		Bike b1=bikeService.readBikeByRegNUmber(registrationNumber);
		return b1;
	}
	@GetMapping
	public List<Bike> getAllBikes(){
		List<Bike> bikeList=bikeService.readAllBikes();
		return bikeList;	
	}
	@PutMapping
	public Bike update(@RequestBody Bike bike) {
		return bikeService.updateBike(bike);	
	}
	@DeleteMapping(value="{registrationNumber}")
	public String delete(@PathVariable String registrationNumber) {
		return bikeService.deleteBikeByRegNumber(registrationNumber);
		
	}
    
}

