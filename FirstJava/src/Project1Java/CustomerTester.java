package Project1Java;

/**
* This is the main driver file for Customer objects, and allows the user to 
* see the usage of 3 Subclasses of the Customer object.
* @date: 16/06/2023
* @author Brendan Goddard
* 
*/

public class CustomerTester {

    /**
     * @param args
     */

    public static void main(String[] args) {
        //Output welcome screen
        System.out.println("Welcome to the Customer tester!\r\n" + //
                "\r\n" + //
                "---------------------------------------------------------------------------------------\r\n" + //
                "\r\n" + //
                "This program will instantiate objects of the Customer hierarchy and test their methods\r\n" + //
                "\r\n" + //
                "---------------------------------------------------------------------------------------");

        //Create customer array sized for 3 customers
        Customer customerArray[] = new Customer[3];

        //Populate the customer array with a business, retail and preffered customer
        customerArray[0] = new BusinessCustomer("Mike", "Holmes", "Business Customer", "Home Depot", 10, 3105.50);
        customerArray[1] = new RetailCustomer("Dev", "Gelda", "Retail Customer", 11200.00);
        customerArray[2] = new PrefferedCustomer("Wei", "Ping", "Preffered Customer", 6456.85, 5);

        //Interate through each customer and call tostring method from it, outputting info on the customer
        for(int i=0; i < customerArray.length; i++) {
            System.out.println(customerArray[i].toString());
        }

        //Iterate through each customer again and call firstName method, lastName method and incetives to show the user each customers incentives
        for(int i=0; i < customerArray.length; i++) {
            System.out.println(customerArray[i].getFirstName() 
            + " " + customerArray[i].getLastName() + " earns a discount" +
            "incentive of $" + String.format("%.2f", (customerArray[i].incentives())) +"\n");
        }
        
        //Create three customers, but class them as specific class names rather than general customer
        BusinessCustomer customer1 = new BusinessCustomer("Tristan", "Lee", "Business Customer", "Starbucks", 15, 9875.25);
        RetailCustomer customer2 = new RetailCustomer("Carlos", "Beltran", "Retail Customer", 3100.50);
        PrefferedCustomer customer3 = new PrefferedCustomer("Arti", "Patel", "Preffered Customer", 10450.00, 10);
       
        //Print out info on those three new customers with toString method
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());

        //Change some values for customer 1 2 and 3, to show the setter methods work
        customer1.setTotalPurchases(8895.00);
        customer1.setDiscountRate(12);
        customer2.setTotalPurchases(100500.00);
        customer3.setLastName("Patel-Ruhil");
        customer3.setTotalPurchases(14987.24);
        customer3.setCashBackRate(13);

        //REPrint out the info on the three new customers with toString method
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());

    }

}
