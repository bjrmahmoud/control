package org.example.control.service;

import org.example.control.dao.entities.Car;
import org.example.control.dao.repositories.CarRepositorie;
import org.example.control.dto.CarDto;
import org.example.control.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager implements CarService{
    @Autowired
   CarMapper carMapper;

    @Autowired
   CarRepositorie carRepositorie;
    @Override
    public CarDto saveComputer(CarDto carDto) {
        Car car = CarMapper.toCar(carDto);
        car = CarRepositorie.save(car);
        return CarMapper.toCarDto(car);
    }

    @Override
    public List<CarDto> getCarByModel(String model) {
        List<Car> Cars= carRepositorie.findByModel(model);
        List<CarDto> CarDtos = new ArrayList<>();
        for (Car Computer : Cars) {
            CarDtos.add(CarMapper.toCarDto(Computer));
        }
        return CarDtos;
    }

    @Override
    public CarDto getCarById(int id) {
        return null;
    }
}
