package org.example.devoircar.service;

import org.example.devoircar.dto.CarDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CarService {
    List<CarDTO> getCarByModel(String model);
    CarDTO saveCar(CarDTO carDTO);
}
