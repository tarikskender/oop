package org.example;
import java.util.HashMap;
import java.util.List;

public class Restaurant{

    String restaurantName;
    List<Customer> customers;
    HashMap<String, MenuItem> menuItems;

    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void addMenuItem(MenuItem item) {
        menuItems.put(item.getCode(), item);
    }

    public Customer getCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null; // Return null if no customer is found
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (MenuItem item : menuItems.values()) {
            System.out.println("- " + item.getDescription() + " (Price: $" + item.getPrice() + ")");
        }
    }
    public double calculateTotalSales(){
        return 2.4;
    }
}
