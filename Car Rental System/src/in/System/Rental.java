package in.System;
class Rental // third class
{
    private Car car; //The car being rented.
    private Customer customer;	//The customer renting the car.
    private int days;	// The number of days the car is rented.

    public Rental(Car car, Customer customer, int days)
    {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }
    // getCar(), getCustomer(), getDays(): Getter methods for rental attributes.
    public Car getCar() 
    {
        return car;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public int getDays()
    {
        return days;
    }
}