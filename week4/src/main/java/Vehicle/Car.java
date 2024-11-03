package Vehicle;

public class Car extends Vehicle implements Repairable {
    public Car(String modelName) {
        super(modelName);
    }

    public Car(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String Repair(){
        return "Model " + this.modelName + " repaired";
    }

    public void Drive(int miles){
        this.mileage += miles;
        health--;
    }

    @Override
    public String Service() {
        return "Standard car service";
    }

    @Override
    public int expectedLifespan() {
        return 15;
    }
}
