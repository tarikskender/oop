package Vehicle;

public abstract class Vehicle{

    public String modelName;
    public int mileage;
    public int health;

    public Vehicle(String modelName){
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100;
    }
    public Vehicle(String modelName, int mileage, int health){
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health;
    }

    public String getModelName() {
        return modelName;
    }
    public int getMileage(){
        return mileage;
    }
    public int getHealth(){
        return health;
    }
    abstract public String Service();
    abstract public String Repair();
    abstract public int expectedLifespan();

    public boolean needsMaintenance(){
        return health >= 70;
    }
    public int calculateRemainingLifespan(){

        int expectedLifespan = 20;

        if(health<50)
          expectedLifespan-=10;
        if(mileage>200000)
          expectedLifespan-=5;

        return expectedLifespan;
    }
}

