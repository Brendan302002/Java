package Project1Java;

public class PrefferedCustomer extends RetailCustomer {

    private int cashbackRate;

    public PrefferedCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashbackRate) {
        super(firstName, lastName, customerLevel, totalPurchases);
        this.cashbackRate = cashbackRate;
    }

    public int getCashBackRate() {
        return cashbackRate;
    }

    public void setCashBackRate(int cashbackRate) {
        this.cashbackRate = cashbackRate;
    }

    @Override
    public double incentives() {
        double cashBack = super.incentives() * (double) cashbackRate / 100;
        return (super.incentives() + cashBack); 

    }

    @Override
    public String toString() {
        return super.toString() + "CashBack Rate: " + cashbackRate + "%\n\n";
    }
}
