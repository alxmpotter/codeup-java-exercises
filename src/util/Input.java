package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        System.out.println("y / n?");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }


    public int getInt(){
        int userInput = scanner.nextInt();
        return userInput;

    }

    public int getInt(int min, int max) {
        int userInput = getInt();

        if ( userInput < min || userInput > max ) {
            System.out.println(userInput + " is not between " + min + " and " + max);
            getInt(min, max);
        } else {
            System.out.println("that works");
        }

        return userInput;
    }

    public double getDouble(){
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max){
        return scanner.nextDouble();
    }

//    public String nextLine() {
//    }
}
