import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//         exercise1();
//         exercise2();
//         exercise3();
//         exercise4();
//         exercise5();
//           exercise6();
//           exercise7();
//           exercise8();
//           exercise9();
        exercise10();
    }
    public static void exercise1(){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = myObj.nextLine();

        if(password.equals("tarik"))
            System.out.println("Bravo");
        else
            System.out.println("Wrong Password");

        myObj.close();
    }
    public static void exercise2(){

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        int sum = 0;

        for(int i = 0; i < 3; i++){
            array[i] = scanner.nextInt();
            sum+=array[i];
        }
        scanner.close();
        System.out.println(sum);
    }
    public static void exercise3(){

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        int sum = 0, number = 1;

        while(number!=0){
            number = scanner.nextInt();
            sum+=number;
        }
        scanner.close();
        System.out.println(sum);
    }
    public static void exercise4(){
        Scanner scanner = new Scanner(System.in);

        int number1, number2;
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        while(number1 != number2){
            System.out.print(number1+++" ");
        }
    }
    public static void exercise5(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), sum = 1;

        for(int i = 0; i < n; i ++){
            sum+=(int)Math.pow(2,i);
        }
        System.out.println(sum);
    }
    public static void exercise6(){

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i = 0; i < n; i ++){
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
        }
    }
    public static void exercise7(){

        Scanner unos = new Scanner(System.in);
        int n = unos.nextInt();

        for(int i = 0; i <= n; i ++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void exercise8(){
        Scanner unos = new Scanner(System.in);

        int n = unos.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void exercise9(){
        Scanner unos = new Scanner(System.in);

        int n = unos.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void exercise10(){

        Scanner unos = new Scanner(System.in);

        int secretNumber = 14, n=0;

        System.out.println("Try to guess a number");

        while(n !=secretNumber){
            n = unos.nextInt();
            if(n<secretNumber)
                System.out.println("Too small");
            else
                System.out.println("Too big");
        }
        System.out.println("Congratulations, your guess is correct!");

    }
}