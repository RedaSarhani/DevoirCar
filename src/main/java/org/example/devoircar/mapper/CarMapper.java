package org.example.devoircar.mapper;

import org.example.devoircar.dao.entity.Car;
import org.example.devoircar.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public CarDTO toDTO(Car car) {
        return modelMapper.map(car, CarDTO.class);
    }

    public Car toEntity(CarDTO carDTO) {
        return modelMapper.map(carDTO, Car.class);
}
}
