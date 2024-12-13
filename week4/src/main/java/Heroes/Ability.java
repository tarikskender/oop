package Heroes;

enum Type{
    Fire,
    Water,
    Air,
    Light
}

public class Ability<T>{

    public String name;
    public T type;
    int abilityPower = 50;

    public Ability(String name, T type){
        this.name = name;
        this.type = type;
    }

    public T getType(){
        return type;
    }

    public void getInfo(){
        System.out.println("Name: "+name+" Type: " + type.toString());
    }

    public void setType(T type){
        this.type = type;
    }

    public void changeAbility(int number){
        abilityPower = number;
    }
    public void changeAbility(String newName){
        this.name = newName;
    }

}
