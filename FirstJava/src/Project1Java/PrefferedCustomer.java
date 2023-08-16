package Project1Java;

/**
* This is the preferred subclass, which extends the superclass retail customer
* @date: 16/06/2023
* @author Brendan Goddard
* 
*/

public class PrefferedCustomer extends RetailCustomer {

    //Declare private cashback rate
    private int cashbackRate;

    public PrefferedCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashbackRate) {
        super(firstName, lastName, customerLevel, totalPurchases);
        this.cashbackRate = cashbackRate;
    }

    
    /** 
     * @return int
     */

    public int getCashBackRate() {
        return cashbackRate;
    }

    public void setCashBackRate(int cashbackRate) {
        this.cashbackRate = cashbackRate;
    }

     /**
    * Finds the incentives for the customer
    * @param cashback cashback for customer
    * @param cashbackRate cashbackRate for customer
   */

    @Override
    public double incentives() {
        double cashBack = super.incentives() * (double) cashbackRate / 100;
        return (super.incentives() + cashBack); 

    }

    /**
     * @return total incentives as a double
     */

     /**
     * @return String
     */
    
    @Override
    public String toString() {
        return super.toString() + "CashBack Rate: " + cashbackRate + "%\n\n";
    }
}
