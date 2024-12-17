package org.example.devoircar.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCar;

    private String model;
    private String color;
    private String matricul;
    private Double price;

    public Car(String model, String color, String matricul, Double price) {
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }
}
