package Chapter4Labs.Part2;

public class ItemToPurchase {
    
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    
    /**
     * 
     */
    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
        itemDescription = "none";
    }

    /**
     * 
     */
    public ItemToPurchase(String itemName, String itemDescription, int itemQuantity, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return itemName;
    }

    
    /** 
     * @return int
     */
    public int getPrice() {
        return itemPrice;
    }
    
    
    /** 
     * @return int
     */
    public int getQuantity() {
        return itemQuantity;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setName(String name) {
        itemName = name;
    }

    public void setPrice(int price) {
        itemPrice = price;
    }

    public void setQuantity(int quantity) {
        itemQuantity = quantity;
    }

    public void setItemDescription(String description) {
        itemDescription = description;
    }

    public String printItemCost() {
        return itemName + " " + itemQuantity + " @  $" + itemPrice + " = $" + (itemQuantity * itemPrice);
    }

    public void printItemDescription() {
        System.out.println(itemName + ": " + itemDescription);
    }
}

