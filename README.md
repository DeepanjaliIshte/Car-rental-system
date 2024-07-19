# Car-rental-system

###  Rent a Car
Purpose: This feature allows customers to rent cars with ease.</br>

Key Points:</br>
- Interactive Console: The process is designed to be user-friendly and can be navigated through an interactive console, which can be a command-line interface (CLI) or a graphical user interface (GUI).</br>
- Car Selection: Customers can browse through available cars based on different criteria such as brand, model, and price.</br>
- Confirmation: Once a customer selects a car, they can confirm the rental, and the system updates the car's status to 'rented'.</br>

### 🔁 Return a Car
Purpose: This feature simplifies the process of returning rented cars and updating their availability in the system.</br>

Key Points:
- Identify Rental: The system identifies the car being returned based on the rental record.</br>
- Update Status: The car's status is updated to 'available'.</br>
- Calculate Duration and Cost: The system calculates the total rental duration and the cost based on the rental period.</br>
- Update Rental History: The rental transaction details are saved for future reference.</br>

### 👥 Customer Management
Purpose: This feature manages customer information and maintains records.</br>

Key Points:</br>
- Add Customers: New customers can be added to the system with their personal details.</br>
- Edit Details: Existing customer information can be updated as needed.</br>
- Maintain Records: The system keeps track of all customers, including their rental history, contact information, and preferences.</br>

### 🚗 Car Management
Purpose: This feature handles the management of the car fleet.</br>

Key Points:</br>
- Add Cars: New cars can be added to the system, including details such as brand, model, and pricing.</br>
- Update Car Details: Existing car information can be edited (e.g., updating the pricing or car status).</br>
- Manage Fleet: The system provides an overview of all cars, including their availability status and other relevant details.</br>

<h3> 📝 Rental History</h3>
Purpose: This feature keeps track of all rental transactions.</br>

Key Points:</br>
- Track Rentals: The system logs each rental transaction, including the car, customer, rental period, and cost.
- Customer Rental History: It maintains a history of all rentals for each customer, which can be useful for generating reports and understanding customer preferences.</br>
- Duration Tracking: The rental history helps in calculating and displaying the rental duration for each transaction.</br>

These features combined provide a comprehensive solution for managing a car rental business, ensuring smooth operations and a positive customer experience.</br>


<h4>
  Java program implements a basic car rental system, providing functionalities to rent and return cars, manage customer records, and track rental history. Here's a detailed explanation of the code components:.
</h4>
 <h1>Classes and Their Functions: </h1>

<h2> Car Class : </h2>
- Attributes:</br>
  - carId: Unique identifier for the car.</br>
  - brand: The car's brand.</br>
  - model: The car's model.</br>
  - basePricePerDay: Daily rental price for the car.</br>
  - isAvailable: A boolean indicating if the car is available for rent.</br>
- Methods:
  - Constructor: Initializes a new Car instance with the given carId, brand, model, and basePricePerDay. Sets isAvailable to true.  </br>
  - Getters: Methods to access the car's carId, brand, model, and availability status.</br>
  - calculatePrice(int rentalDays): Computes the total rental cost based on the number of rental days.</br>
  - rent(): Marks the car as rented by setting isAvailable to false.</br>
  - returnCar(): Marks the car as available by setting isAvailable to true. </br>

<h2> Customer Class : </h2>
- Attributes: </br>
  - customerId: Unique identifier for the customer. </br>
  - name: The customer's name. </br>
- Methods: </br>
  - Constructor : Initializes a new Customer instance with the given customerId and name.</br>
  - Getters : Methods to access the customer's customerId and name.</br>

<h2> Rental Class : </h2>
- Attributes: </br>
  - car: The rented car. </br>
  - customer: The customer who rented the car. </br>
  - days: The number of rental days.</br>
- Methods: </br>
  - Constructor: Initializes a new Rental instance with the given car, customer, and days.</br>
  - Getters: Methods to access the car, customer, and days. </br>

<h2> CarRentalSystem Class : </h2>
- Attributes:</br>
  - cars: A list of all available cars.</br>
  - customers: A list of all customers.</br>
  - rentals: A list of all rental transactions.</br>
- Methods:</br>
  - Constructor: Initializes empty lists for cars, customers, and rentals.</br>
  - addCar(Car car): Adds a new car to the cars list.</br>
  - addCustomer(Customer customer): Adds a new customer to the customers list.</br>
  - rentCar(Car car, Customer customer, int days): Rents a car to a customer for a specified number of days. Adds the rental to the rentals list and updates the car's availability.</br>
  - returnCar(Car car): Returns a rented car, updates its availability, and removes the corresponding rental from the rentals list.
  - menu(): Displays the menu and handles user input for renting and returning cars.</br>

<h2> Main Class: </h2>
- main() Method:</br>
  - Creates an instance of CarRentalSystem.</br>
  - Adds sample cars to the system.</br>
  - Calls the menu() method to start the interactive console for car rental operations.</br>

<h3> Program Flow: </h3>

1. Initialization: The main method creates a CarRentalSystem instance and adds some sample cars to the system. </br>
2. Menu Display: The menu method displays a menu with options to rent a car, return a car, or exit.</br>
3. Rent a Car:</br>
   - Prompts the user to enter their name.</br>
   - Displays available cars.</br>
   - Prompts the user to select a car and specify rental days.</br>
   - Adds a new customer and confirms the rental.</br>
4. Return a Car:</br>
   - Prompts the user to enter the car ID of the car to be returned.</br>
   - Updates the car's availability and removes the rental record.</br>
5. Exit: Ends the program.</br>

This program provides a foundational structure for a car rental system, which can be further enhanced with additional features like advanced error handling, more detailed rental records, and a persistent storage mechanism for cars, customers, and rentals.
