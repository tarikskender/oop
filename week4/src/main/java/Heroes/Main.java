package Heroes;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Ability<Type> fireball = new Ability<>("Fireball", Type.Fire);
        fireball.getInfo();

        fireball.changeAbility(50);
        fireball.getInfo();

        HashMap<String, Integer> Students = new HashMap<>();

        Students.put("Tarik", 12345);
        Students.put("Aid", 23451);
        Students.put("Samed", 54321);

        System.out.println(Students.get(""));

    }
}
