package in.System;

class Customer 	//second class
{
	private String customerId;	//Unique identifier for the customer.
	private String name;	// Name of the customer.

	public Customer(String customerId, String name) 
	{
	    this.customerId = customerId;
	    this.name = name;
	    /*
	     the constructor takes two parameters (customerId and name) 
	     and assigns them to the instance variables (this.customerId and this.name).
	     */
		}

		// getCustomerId(), getName(): Getter methods for customer attributes.
		public String getCustomerId() 
		{
		    return customerId;
		}
		
		public String getName()
		{
		    return name;
		}
}