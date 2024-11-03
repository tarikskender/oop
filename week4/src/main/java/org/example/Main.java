package org.example;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.setValue(10);
        System.out.println("Value: " + entity.getValue());
    }
}

class Entity {
    private int value;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 0) {
            this.value = value;
        } else {
            System.out.println("Value cannot be negative.");
        }
    }
}
