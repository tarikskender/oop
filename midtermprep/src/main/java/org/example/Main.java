package org.example;

public class Main {

    public static void main(String[] args) {
        Dish pasta = new Dish("D001", "Spaghetti Carbonara", 12.99, CuisineType.ITALIAN, "Pasta");
        Dish friedRice = new Dish("D002", "Fried Rice", 8.99, CuisineType.CHINESE, "Rice");
        Dish tacos = new Dish("D003", "Tacos", 10.49, CuisineType.MEXICAN, "Beef");

        System.out.println("Dish Details:");
        System.out.println("1. " + pasta.getDescription());
        System.out.println("2. " + friedRice.getDescription());
        System.out.println("3. " + tacos.getDescription());

        tacos.setMainIngredient("Chicken");
        tacos.setCuisineType(CuisineType.INDIAN);
        System.out.println("\nUpdated Tacos Description: " + tacos.getDescription());

        TableReservation<Dish> reservation = new TableReservation<>("R001", new java.util.Date(), 5);

        // Add dishes to the reservation
        reservation.addItemToOrder(pasta, 2);
        reservation.addItemToOrder(friedRice, 3);
        reservation.addItemToOrder(tacos, 1);

        // Calculate the total amount for the reservation
        System.out.println("\nTotal Amount for Reservation: $" + reservation.calculateTotalAmount());
    }
}
