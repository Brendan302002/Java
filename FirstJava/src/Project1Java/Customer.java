package Project1Java;

/**
* This is the Customer superclass, which allows for subclasses, takes the firstname, lastname and customer level.
* It then uses the setcustomerid method to set a id for the customer consisting of the first 4 letters of their last name
* concatenated with a "-" then 5 random numbers using the math.random function in java. Print method in the subclasses calls the superclass
* toString method and concatenates more onto it.
*
* @author Brendan Goddard
* @date: 16/06/2023
*
*/

import java.util.Random;

//Abstract class implementation
abstract class Customer {

    //Declare private firstname, lastname, customerid, and customer level variables
    private String firstName;
    private String lastName;
    private String customerID;
    private String customerLevel;

    /**
    * Constructor initializing firstname, lastname and customerLevel
    * @param firstname firstname of customer
    * @param lastname lastname of customer
    * @param customerLevel level of customer("Business", "Retail", "Preffered")
    */ 
    public Customer(String firstName, String lastName, String customerLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerLevel = customerLevel;
        this.customerID = setCustomerID();
    }

    
    /** 
     * @return String
     */

    public String getFirstName(){
        return firstName;
    }

    /** 
     * @return String
     */

    public String getLastName() {
        return lastName;
    }

    /** 
     * @return String
     */

    public String getCustomerID() {
        return customerID;
    }

    /** 
     * @return String
     */

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
    * Gets the customer ID
    * @param lastname 
    * @param customerID
   */

    public String setCustomerID() {
        String id = "";

        if (lastName.length() >= 4) {
            id = lastName.substring(0, 4).toUpperCase();
        } else {
            id = lastName.substring(0, lastName.length()).toUpperCase();
            int leftoverCharacters = 4 - lastName.length(); 
            for(int i = 0; i < leftoverCharacters; i++) {
                id += "X";
            }
        }

        id += "-";

        Random random= new Random();
        for (int i = 0; i < 5; i++) {
            int randomNum = random.nextInt(10);
            id += randomNum;
        }

        customerID = id;

        return customerID;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public abstract double incentives();


    /** 
     * @return String
     */

    public String toString() {
        //MATCH WITH OUTPUT
        return customerID + ", " + firstName + " " + lastName + "\n";
    }

}