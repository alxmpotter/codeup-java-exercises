import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        System.out.println(add(5,5));
        System.out.println(subtract(50, 50));
        System.out.println(multiply(10, 10));
        System.out.println(divide(30, 9));
        System.out.println(remainder(4, 4));

        getInteger(6, 10);
        factorial();

    }


    public static double add(int a, int b) {
        return a + b;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int j, int k) {
        return j * k;
    }
    public static int divide(int r, int s) {
        return r / s;
    }
    public static int remainder(int c, int d) {
        return c % d;
    }

///////////////Number Range

        public static int getInteger(int min, int max){
            System.out.println("Pick a number between " + min + " and " + max);
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();

            if (userInput < min || userInput > max) {
                System.out.println("Out of range.");
                getInteger(min, max);
            } else {
//                System.out.println("That works!");
            }
            return userInput;


        }

        public static void factorial(){
            System.out.println("Let's factor numbers!");
            int userInput = getInteger(1, 10);

            int factor = 1;
            for (int i = 1; i <= userInput; i++) {
                factor = factor * i;
            }

            System.out.println(userInput + "! = " + factor);

        }

}








