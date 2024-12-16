package org.example.control.dao.repositories;

import org.example.control.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepositorie extends JpaRepository<Car, Long> {
    List<Car> findByModel(String model);

}
