package Chapter4Labs.Part2;

import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<>();
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        cartItems = new ArrayList<>();
    }

    
    /** 
     * @return String
     */
    public String getCustomerName() {
        return customerName;
    }

    
    /** 
     * @return String
     */
    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item) {
        cartItems.add(item);
    }

    public void removeItem(String itemName) {
        boolean found = false;
        for (ItemToPurchase item : cartItems) {
            if (item.getName().equals(itemName)) {
                cartItems.remove(item);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }

    public void modifyItem(ItemToPurchase modifiedItem) {
        boolean found = false;
        for (ItemToPurchase item : cartItems) {
            if (modifiedItem.getName().equals(modifiedItem.getName())) {
                if (!(modifiedItem.getItemDescription().equals("none"))) {
                    modifiedItem.setItemDescription(modifiedItem.getItemDescription());
                }
                if (modifiedItem.getPrice() != 0) {
                    modifiedItem.setPrice(modifiedItem.getPrice());
                }
                if (modifiedItem.getQuantity() != 0) {
                    modifiedItem.setQuantity(modifiedItem.getQuantity());
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    public int getNumItemsInCart() {
        int totalQuantity = 0;
        for (ItemToPurchase item : cartItems) {
            totalQuantity += item.getQuantity();
        }
        return totalQuantity;
    }

    public int getCostOfCart() {
        int totalCost = 0;
        for (ItemToPurchase item : cartItems) {
            totalCost += (item.getPrice() * item.getQuantity());
        }
        return totalCost;
    }

    public void printTotal() {
        if (cartItems.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY");
        } else {
            System.out.println(customerName + "'s Shopping Cart - " + currentDate);
            System.out.println("Number of Items: " + getNumItemsInCart());
            System.out.println();

            for (ItemToPurchase item : cartItems) {
                item.printItemCost();
            }

            System.out.println();
            System.out.println("Total: $" + getCostOfCart());
        }
    }

    public void printDescriptions() {
        if (cartItems.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY");
        } else {
            System.out.println(customerName + "'s Shopping Cart - " + currentDate);
            System.out.println();
            System.out.println("Item Descriptions:");

            for (ItemToPurchase item : cartItems) {
                item.printItemDescription();
            }
        }
    }
}
