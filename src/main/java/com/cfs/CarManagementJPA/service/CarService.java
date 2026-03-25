package com.cfs.CarManagementJPA.service;

import com.cfs.CarManagementJPA.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {
    Car saveCar(Car car);

    List<Car> getAllCar();
    Car getCarById(Integer id);

    Car updateCar(Integer id,Car car);

    void deleteCar(Integer id);
}
