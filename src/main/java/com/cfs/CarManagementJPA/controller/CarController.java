    package com.cfs.CarManagementJPA.controller;

    import com.cfs.CarManagementJPA.entity.Car;
    import com.cfs.CarManagementJPA.service.CarService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/car")
    public class CarController {
        @Autowired
        private final CarService carService;

        public CarController(CarService carService) {
            this.carService = carService;
        }

        @PostMapping
        public Car saveCar(@RequestBody Car car) {
            return carService.saveCar(car);
        }

        @GetMapping
        public List<Car> getAllCar() {
            return carService.getAllCar();
        }

        @GetMapping("/{id}")
        public Car getCarById(@PathVariable Integer id) {
            return carService.getCarById(id);
        }

        @PutMapping("/{id}")
        public Car updateCar(@PathVariable Integer id, @RequestBody Car car)
        {
            return carService.updateCar(id,car);
        }

        @DeleteMapping("/{id}")
        public String deleteCar(@PathVariable Integer id)
        {
            carService.deleteCar(id);
            return  "Car Delete Successfully....!!!";
        }

    }
