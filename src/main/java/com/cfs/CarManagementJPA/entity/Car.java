package com.cfs.CarManagementJPA.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "car_table")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "car_name", nullable = false, length = 30)
    private String carName;

    @Column(name = "car_type", nullable = false, length = 30)
    private String carType;

    @Column(name = "car_price", nullable = false)
    private double carPrice;

    public Car(Integer id, String carName, String carType, Double carPrice) {
        this.id = id;
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }
}
