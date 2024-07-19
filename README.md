# Car-rental-system

<h3>
  Java program implements a basic car rental system, providing functionalities to rent and return cars, manage customer records, and track rental history. Here's a detailed explanation of the code components:.
</h3>
 Classes and Their Functions:

<h2> Car Class : </h2>
- **Attributes**:
  - `carId`: Unique identifier for the car.
  - `brand`: The car's brand.
  - `model`: The car's model.
  - `basePricePerDay`: Daily rental price for the car.
  - `isAvailable`: A boolean indicating if the car is available for rent.
- **Methods**:
  - **Constructor**: Initializes a new Car instance with the given `carId`, `brand`, `model`, and `basePricePerDay`. Sets `isAvailable` to true.
  - **Getters**: Methods to access the car's `carId`, `brand`, `model`, and availability status.
  - **calculatePrice(int rentalDays)**: Computes the total rental cost based on the number of rental days.
  - **rent()**: Marks the car as rented by setting `isAvailable` to false.
  - **returnCar()**: Marks the car as available by setting `isAvailable` to true.

<h2> Customer Class : </h2>
- **Attributes**:
  - `customerId`: Unique identifier for the customer.
  - `name`: The customer's name.
- **Methods**:
  - **Constructor**: Initializes a new Customer instance with the given `customerId` and `name`.
  - **Getters**: Methods to access the customer's `customerId` and `name`.

<h2> Rental Class : </h2>
- **Attributes**:
  - `car`: The rented car.
  - `customer`: The customer who rented the car.
  - `days`: The number of rental days.
- **Methods**:
  - **Constructor**: Initializes a new Rental instance with the given `car`, `customer`, and `days`.
  - **Getters**: Methods to access the `car`, `customer`, and `days`.

<h2> CarRentalSystem Class : </h2>
- **Attributes**:
  - `cars`: A list of all available cars.
  - `customers`: A list of all customers.
  - `rentals`: A list of all rental transactions.
- **Methods**:
  - **Constructor**: Initializes empty lists for `cars`, `customers`, and `rentals`.
  - **addCar(Car car)**: Adds a new car to the `cars` list.
  - **addCustomer(Customer customer)**: Adds a new customer to the `customers` list.
  - **rentCar(Car car, Customer customer, int days)**: Rents a car to a customer for a specified number of days. Adds the rental to the `rentals` list and updates the car's availability.
  - **returnCar(Car car)**: Returns a rented car, updates its availability, and removes the corresponding rental from the `rentals` list.
  - **menu()**: Displays the menu and handles user input for renting and returning cars.

<h2> Main Class: </h2>
- **main() Method**:
  - Creates an instance of `CarRentalSystem`.
  - Adds sample cars to the system.
  - Calls the `menu()` method to start the interactive console for car rental operations.

<h3> Program Flow: </h3>

1. **Initialization**: The `main` method creates a `CarRentalSystem` instance and adds some sample cars to the system.
2. **Menu Display**: The `menu` method displays a menu with options to rent a car, return a car, or exit.
3. **Rent a Car**:
   - Prompts the user to enter their name.
   - Displays available cars.
   - Prompts the user to select a car and specify rental days.
   - Adds a new customer and confirms the rental.
4. **Return a Car**:
   - Prompts the user to enter the car ID of the car to be returned.
   - Updates the car's availability and removes the rental record.
5. **Exit**: Ends the program.

This program provides a foundational structure for a car rental system, which can be further enhanced with additional features like advanced error handling, more detailed rental records, and a persistent storage mechanism for cars, customers, and rentals.
