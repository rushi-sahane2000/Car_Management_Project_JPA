package com.cfs.CarManagementJPA.repository;

import com.cfs.CarManagementJPA.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {

}
