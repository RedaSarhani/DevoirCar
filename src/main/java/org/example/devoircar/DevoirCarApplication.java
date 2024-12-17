package org.example.devoircar;

import org.example.devoircar.dao.entity.Car;
import org.example.devoircar.dao.repository.CarRepository;
import org.example.devoircar.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevoirCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoirCarApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(CarRepository carRepository) {
        return args -> {
            carRepository.save(new Car("Model X", "Red", "1234A", 100000.0));
            carRepository.save(new Car("Model Y", "Blue", "2345B", 80000.0));
            carRepository.save(new Car("Model S", "White", "4567C", 120000.0));
            carRepository.save(new Car("Model 3", "Black", "L1234", 70000.0));
        };

    }
}
