package Project1Java;

public class BusinessCustomer extends Customer{

    private String companyName;
    private int discountRate;
    private double totalPurchases;


    public BusinessCustomer(String firstName, String lastName, String customerLevel, String companyName, int discountRate, double totalPurchases) {
        super(firstName, lastName, customerLevel);
        this.companyName = companyName;
        this.discountRate = discountRate;
        this.totalPurchases = totalPurchases;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getDiscountRate() {
        return discountRate;
    }

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

    @Override 
    public double incentives() {
        double doubleDiscountRate = discountRate / 100.0;
        return totalPurchases * doubleDiscountRate;
    }

    @Override 
    public String toString() {
        //MATCH WITH OUTPUT
        return "\n" + super.toString() + "\n" + super.getCustomerLevel() + " for " + 
        getCompanyName() + "\n\n" + "Total Purchases: $" + getTotalPurchases() + "\n\n"
        + "Discount Rate: " + getDiscountRate() + "%\n\n" + "Discount Incentive: $" +
        String.format("%.2f", incentives()) + "\n\nNet Purchases: $" + String.format("%.2f",(totalPurchases - incentives())) + "\n\n";
    }
}

    

