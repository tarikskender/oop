package org.example;

public class Main {
    public static void main(String[] args) {
        // Create an object of the class
        Entity entity = new Entity();

        // Set the value using the setter method
        entity.setValue(10);

        // Get the value using the getter method
        System.out.println("Value: " + entity.getValue());
    }
}

class Entity {
    // Private field (not directly accessible)
    private int value;

    // Getter method (used to access the value)
    public int getValue() {
        return value;
    }

    // Setter method (used to update the value)
    public void setValue(int value) {
        // We can include validation or additional logic here
        if (value >= 0) {
            this.value = value;
        } else {
            System.out.println("Value cannot be negative.");
        }
    }
}
