package Project1Java;

public class RetailCustomer extends Customer {

    private double totalPurchases;

    public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases) {
        super(firstName, lastName, customerLevel);
        this.totalPurchases = totalPurchases;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }
    
    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    
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

    @Override 
    public double incentives() {
        double customerDiscount = findDiscountRate() / 100.0;
        return totalPurchases * customerDiscount;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\n\n" + super.getCustomerLevel() + "\n\n" +
        "Total Purchases: $" + getTotalPurchases() + "\n\n" + "Discount Rate: " + findDiscountRate()
         + "%\n\n" + "Discount Incentive: $" + String.format("%.2f", incentives()) +
        "\n\nNet Purchases: $" + String.format("%.2f", (totalPurchases - incentives())) + "\n\n";
     }
}
