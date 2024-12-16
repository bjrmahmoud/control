package org.example.control.mapper;

import org.example.control.dao.entities.Car;
import org.example.control.dto.CarDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    public static CarDto toCarDto(Car Car) {
        return modelMapper.map(Car, CarDto.class);
    }

    public static Car toCar(CarDto CarDto) {
        return modelMapper.map(CarDto, Car.class);
    }
}
