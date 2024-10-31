package people;

public class Person {
    public String name;
    public String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String toString() {
        return this.name + ", " + this.address;
    }
    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.getCredits());
        olli.study();
        System.out.println("credits "+ olli.getCredits());
    }
}
class Student extends Person{

    private int credits = 0;

    public Student(String name, String address){
        super(name,address);
        this.credits = 0;
    }

    public int getCredits(){
        return this.credits;
    }

    public void study() {
        this.credits++;
    }
    @Override
    public String toString() {
        return super.toString() + ", credits: " + this.credits;
    }
}
