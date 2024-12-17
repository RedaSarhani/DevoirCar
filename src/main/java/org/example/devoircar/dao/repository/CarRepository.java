package org.example.devoircar.dao.repository;

import org.example.devoircar.dao.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> findByModel(String model);
}
