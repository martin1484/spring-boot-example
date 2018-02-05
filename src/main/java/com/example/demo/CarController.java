package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

	private CarService carService;
	
	
	public CarController(CarService carService) {
		this.carService = carService;
	}
	
	@RequestMapping("/api/cool-cars")
	@CrossOrigin(origins = "https://martin-spring-boot-example.herokuapp.com")
	public List<Car> getCoolCars(){
		return this.carService.findAllCars();
	}
	
}
