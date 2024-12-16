package org.example.control.service;

import org.example.control.dto.CarDto;

import java.util.List;

public interface CarService {
    public CarDto saveCar(CarDto carDto);

    CarDto saveCar(CarDto carDto);

    public List<CarDto> getCarByModel(String model);
    public CarDto getCarById(int id);



}
