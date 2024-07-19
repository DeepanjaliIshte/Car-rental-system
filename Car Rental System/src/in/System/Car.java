package in.System;
	
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car		//First class
{
    private String carId;	//Unique identifier for the car.
    private String brand;	// Brand of the car (e.g., Toyota, Honda).
    private String model;	//Model of the car (e.g., Camry, Civic).
    private double basePricePerDay;	//  Rental price per day.
    private boolean isAvailable; // Indicates if the car is available for rent.

    public Car(String carId, String brand, String model, double basePricePerDay) {
        this.carId = carId;	 
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }
    
    // getCarId(), getBrand(), getModel(): Getter methods for car attributes.
    public String getCarId() 
    {
        return carId;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public double calculatePrice(int rentalDays) //  Calculates total rental price based on the number of days.
    
     {
        return basePricePerDay * rentalDays;
    }

    public boolean isAvailable() // Checks if the car is available for rent.
    {
        return isAvailable;
    }

    public void rent() // Marks the car as rented.
    {
        isAvailable = false;	
    }

    public void returnCar() //Marks the car as available.
    {
        isAvailable = true;
    }
}





