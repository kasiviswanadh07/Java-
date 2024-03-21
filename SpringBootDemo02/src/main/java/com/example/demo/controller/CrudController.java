package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;

@RestController
@RequestMapping("/laptop")
public class CrudController {
	Laptop laptop;

	@GetMapping(value = "{serialNumber}")
	public Laptop read(@PathVariable String serialNumber) {
//		return new Laptop(serialNumber, "Hp", 652626);
		return laptop;
	}

	@PostMapping
	public String create(@RequestBody Laptop laptop) {
		this.laptop=laptop;
		return "Laptop Created Successfully";	
    }
	@PutMapping
	public String update(@RequestBody Laptop laptop) {
		this.laptop=laptop;
		return "Laptop Updated Successfully";
		
	}
	@DeleteMapping("{serialNumber}")
	public String delete(@PathVariable String serialNumber) {
//		return new Laptop(serialNumber,"Dell",1236);
		laptop=null;
		return "Laptop deleted";
	}
}
