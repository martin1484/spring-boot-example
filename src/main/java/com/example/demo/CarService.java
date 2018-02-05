package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CarService {

	private List<Car> cars = new ArrayList<Car>();

	public List<Car> findAllCars() {
		Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti", "AMC Gremlin", "Triumph Stag", "Ford Pinto",
				"Yugo GV").forEach(name -> {
					Car car = new Car();
					car.setName(name);
					cars.add(car);
				});
		return cars;
	}

}
