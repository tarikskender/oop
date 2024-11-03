package Vehicle;

public class Main{
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota"); // Assuming Car is a subclass of Vehicle
        System.out.println("Model: " + myCar.getModelName());
        System.out.println("Mileage: " + myCar.getMileage());
        System.out.println("Health: " + myCar.getHealth());
        System.out.println("Needs maintenance: " + myCar.needsMaintenance());
        System.out.println("Remaining lifespan: " + myCar.calculateRemainingLifespan());
        System.out.println("Service: "+myCar.Service());
        System.out.println("Repairs: "+myCar.Repair());
    }
}

