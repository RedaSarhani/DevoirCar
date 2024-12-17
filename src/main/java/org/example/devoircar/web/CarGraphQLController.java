package org.example.devoircar.web;

import org.example.devoircar.dto.CarDTO;
import org.example.devoircar.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {
    private final CarService carService;

    public CarGraphQLController(CarService carService) {
        this.carService = carService;
    }

    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model) {
        return carService.getCarByModel(model);
    }

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car) {
        return carService.saveCar(car);
    }
}
