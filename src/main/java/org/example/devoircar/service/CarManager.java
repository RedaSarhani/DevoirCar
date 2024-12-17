package org.example.devoircar.service;

import lombok.AllArgsConstructor;
import org.example.devoircar.dao.entity.Car;
import org.example.devoircar.dao.repository.CarRepository;
import org.example.devoircar.dto.CarDTO;
import org.example.devoircar.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarManager implements CarService{
    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarManager(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        return carRepository.findByModel(model)
                .stream()
                .map(carMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        Car car = carMapper.toEntity(carDTO);
        return carMapper.toDTO(carRepository.save(car));
    }

}
