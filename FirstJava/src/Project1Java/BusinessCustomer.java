package Project1Java;

/**
* This is the Business subclass, which extends the superclass Customer
* @date: 16/06/2023
* @author Brendan Goddard
* 
*/

public class BusinessCustomer extends Customer{

    //Declare private companyname, discountrate, totalpurchases
    private String companyName;
    private int discountRate;
    private double totalPurchases;

    /**
    * Constructor initializing business customer fields
    * @param firstname firstname of customer
    * @param lastname lastname of customer
    * @param customerLevel level of customer("Business", "Retail", "Preffered")
    * @param companyName companyName
    * @param discountRate discount rate of customer
    * @param totalPurchases total purchases made by customer
    */ 
    
    public BusinessCustomer(String firstName, String lastName, String customerLevel, String companyName, int discountRate, double totalPurchases) {
        super(firstName, lastName, customerLevel);
        this.companyName = companyName;
        this.discountRate = discountRate;
        this.totalPurchases = totalPurchases;
    }

    
    /** 
     * @return String
     */

    public String getCompanyName() {
        return companyName;
    }

    /** 
     * @return int
     */

    public int getDiscountRate() {
        return discountRate;
    }

    /** 
     * @return double
     */

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    /**
    * Finds the incentives for the customer
    * @param discountRate discount rate of customer
    * @param totalPurchases total purchases of customer
   */

    @Override 
    public double incentives() {
        double doubleDiscountRate = discountRate / 100.0;
        return totalPurchases * doubleDiscountRate;
    }

    /**
    * @return total incentives as a double
    */


    /**
     * @return String
     */
    
    @Override 
    public String toString() {
        //MATCH WITH OUTPUT
        return "\n" + super.toString() + "\n" + super.getCustomerLevel() + " for " + 
        getCompanyName() + "\n\n" + "Total Purchases: $" + getTotalPurchases() + "\n\n"
        + "Discount Rate: " + getDiscountRate() + "%\n\n" + "Discount Incentive: $" +
        String.format("%.2f", incentives()) + "\n\nNet Purchases: $" + String.format("%.2f",(totalPurchases - incentives())) + "\n\n";
    }
}

    

