package Project1Java;

public class CustomerTester {
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the Customer tester!\r\n" + //
                "\r\n" + //
                "---------------------------------------------------------------------------------------\r\n" + //
                "\r\n" + //
                "This program will instantiate objects of the Customer hierarchy and test their methods\r\n" + //
                "\r\n" + //
                "---------------------------------------------------------------------------------------");
        Customer customerArray[] = new Customer[3];

        customerArray[0] = new BusinessCustomer("Mike", "Holmes", "Business Customer", "Home Depot", 10, 3105.50);
        customerArray[1] = new RetailCustomer("Dev", "Gelda", "Retail Customer", 11200.00);
        customerArray[2] = new PrefferedCustomer("Wei", "Ping", "Preffered Customer", 6456.85, 5);

        for(int i=0; i < customerArray.length; i++) {
            System.out.println(customerArray[i].toString());
        }

        for(int i=0; i < customerArray.length; i++) {
            System.out.println(customerArray[i].getFirstName() 
            + " " + customerArray[i].getLastName() + " earns a discount" +
            "incentive of $" + String.format("%.2f", (customerArray[i].incentives())) +"\n");
        }
        
        BusinessCustomer customer1 = new BusinessCustomer("Tristan", "Lee", "Business Customer", "Starbucks", 15, 9875.25);
        RetailCustomer customer2 = new RetailCustomer("Carlos", "Beltran", "Retail Customer", 3100.50);
        PrefferedCustomer customer3 = new PrefferedCustomer("Arti", "Patel", "Preffered Customer", 10450.00, 10);
       

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());

        customer1.setTotalPurchases(8895.00);
        customer1.setDiscountRate(12);
        customer2.setTotalPurchases(100500.00);
        customer3.setLastName("Patel-Ruhil");
        customer3.setTotalPurchases(14987.24);
        customer3.setCashBackRate(13);

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());

    }

}
