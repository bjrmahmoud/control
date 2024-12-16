package org.example.control;

import org.example.control.dao.entities.Car;
import org.example.control.dao.repositories.CarRepositorie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CarRepositorie  carRepositorie){
        return args -> {
            carRepositorie.save(Car.builder()
                    .model("BMW")
                    .color("Black")
                    .matricule("111111")
                    .price(111.11)
                    .build());

            carRepositorie.save(Car.builder()
                    .model("fORD")
                    .color("Red")
                    .matricule("222222")
                    .price(222.11)
                    .build());


            carRepositorie.save(Car.builder()
                    .model("Dacia")
                    .color("Black")
                    .matricule("111111")
                    .price(111.11)
                    .build());

        };
    }}
