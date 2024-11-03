package Vehicle;

//Create a class named Truck that also extends the Vehicle
//class and implements the Repairable interface. Like Car,
//provide two constructors: one that initializes only the modelName,
//and another that initializes modelName, mileage, and health.

public class Truck extends Vehicle implements Repairable{
    public Truck(String modelName){
        super(modelName);
    }
    public Truck(String modelName, int mileage, int health){
        super(modelName, mileage, health);
    }
    @Override
    public String Repair(){
        return "Model " + this.modelName + " repaired";
    }
}
