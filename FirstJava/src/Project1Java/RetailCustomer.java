package Project1Java;

/**
* This is the retail subclass, which extends the superclass customer.
* @date: 16/06/2023
* @author Brendan Goddard
* 
*/

public class RetailCustomer extends Customer {

    //Declare private totalPurchases
    private double totalPurchases;


    /**
    * Constructor initializing business customer fields
    * @param firstname firstname of customer
    * @param lastname lastname of customer
    * @param customerLevel level of customer("Business", "Retail", "Preffered")
    * @param totalPurchases total purchases made by customer
    */ 

    public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases) {
        super(firstName, lastName, customerLevel);
        this.totalPurchases = totalPurchases;
    }

    
    /** 
     * @return double
     */
    public double getTotalPurchases() {
        return totalPurchases;
    }
    
    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    /**
    * Finds the Discount rate of customer
    * @param totalPurchases total purchases of customer
   */

    public int findDiscountRate() {
        if (totalPurchases > 10000) {
            return 15;
        } else if (totalPurchases < 10000 && totalPurchases > 5000) {
            return 10;
        } else if (totalPurchases < 5000 && totalPurchases > 1000) {
            return 5;
        } else {
            return 0;
        }
    }  

    /**
     * @return int
     */

    /**
    * Finds the incentives for the customer
    * @param discountRate discount rate of customer
    * @param totalPurchases total purchases of customer
   */

    @Override 
    public double incentives() {
        double customerDiscount = findDiscountRate() / 100.0;
        return totalPurchases * customerDiscount;
    }

    /**
    * @return total incentives as a double
    */

    /**
     * @return String
     */
    
    @Override
    public String toString() {
        return "\n" + super.toString() + "\n\n" + super.getCustomerLevel() + "\n\n" +
        "Total Purchases: $" + getTotalPurchases() + "\n\n" + "Discount Rate: " + findDiscountRate()
         + "%\n\n" + "Discount Incentive: $" + String.format("%.2f", incentives()) +
        "\n\nNet Purchases: $" + String.format("%.2f", (totalPurchases - incentives())) + "\n\n";
     }
}
