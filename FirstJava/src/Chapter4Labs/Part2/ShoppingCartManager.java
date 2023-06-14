package Chapter4Labs.Part2;

import java.util.Scanner;

public class ShoppingCartManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer's name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter today's date:");
        String currentDate = scanner.nextLine();

        System.out.println();
        System.out.println("Customer name: " + customerName);
        System.out.println("Today's date: " + currentDate);
        System.out.println();

        ShoppingCart cart = new ShoppingCart(customerName, currentDate);
        printMenu();

        char userChoice = ' ';
        while (userChoice != 'q') {
            System.out.println("Choose an option:");
            userChoice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline character

            if (userChoice == 'a') {
                executeMenu('a', cart, scanner);
            } else if (userChoice == 'd') {
                executeMenu('d', cart, scanner);
            } else if (userChoice == 'c') {
                executeMenu('c', cart, scanner);
            } else if (userChoice == 'i') {
                executeMenu('i', cart, scanner);
            } else if (userChoice == 'o') {
                executeMenu('o', cart, scanner);
            } else if (userChoice == 'q') {
                break;
            } else {
                System.out.println("Invalid option. Please choose a valid option from the menu.");
            }

            System.out.println();
            printMenu();
        }
    }

    public static void printMenu() {
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
    }

    public static void executeMenu(char choice, ShoppingCart cart, Scanner scanner) {
        switch (choice) {
            case 'a':
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                String itemName = scanner.nextLine();
                System.out.println("Enter the item description:");
                String itemDescription = scanner.nextLine();
                System.out.println("Enter the item price:");
                int itemPrice = scanner.nextInt();
                System.out.println("Enter the item quantity:");
                int itemQuantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                ItemToPurchase newItem = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity);
                cart.addItem(newItem);
                break;
            case 'd':
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                String itemToRemove = scanner.nextLine();
                cart.removeItem(itemToRemove);
                break;
            case 'c':
               System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                String itemToModify = scanner.nextLine();
                System.out.println("Enter the new quantity:");
                int newQuantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                ItemToPurchase modifiedItem = new ItemToPurchase(itemToModify, "none", 0, newQuantity);
                cart.modifyItem(modifiedItem);;
                break;
            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                cart.printDescriptions();
                break;
            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                cart.printTotal();
                break;
        }
    }
}