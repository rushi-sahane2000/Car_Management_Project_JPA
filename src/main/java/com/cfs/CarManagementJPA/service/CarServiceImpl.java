package com.cfs.CarManagementJPA.service;

import com.cfs.CarManagementJPA.entity.Car;
import com.cfs.CarManagementJPA.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCar() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Integer id) {
        return carRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Car not found  by id="+id));
    }

    @Override
    public Car updateCar(Integer id, Car car) {
        Car existringCar=carRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Car not found by id="+id));
        existringCar.setCarName(car.getCarName());
        existringCar.setCarType(car.getCarType());
        existringCar.setCarPrice(car.getCarPrice());

        return carRepository.save(existringCar);
    }

    @Override
    public void deleteCar(Integer id) {
        Car existringCar=carRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Car not found by id="+id));

        carRepository.delete(existringCar);

    }
}
