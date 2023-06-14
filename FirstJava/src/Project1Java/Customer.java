package Project1Java;

import java.util.Random;

abstract class Customer {

    private String firstName;
    private String lastName;
    private String customerID;
    private String customerLevel;

    public Customer(String firstName, String lastName, String customerLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerLevel = customerLevel;
        this.customerID = setCustomerID();
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

        Random random= new Random(0);
        for (int i = 0; i < 5; i++) {
            int randomNum = random.nextInt(10);
            id += randomNum;
        }

        customerID = id;

        return customerID;
    }

    public void setCustomerLevel() {
        
    }

    public abstract double incentives();

    public String toString() {
        //MATCH WITH OUTPUT
        return customerID + ", " + firstName + " " + lastName + "\n";
    }

}