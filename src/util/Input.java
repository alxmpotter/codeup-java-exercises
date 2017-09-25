package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(Scanner scanner){
        this.scanner = scanner;
    }

    public Scanner getString(){
        return scanner;
    }

    public boolean yesNo(){
        String userInput = scanner.nextLine();
        return userInput.equals("yes") || userInput.equals("y");
    }


    public int getInt(){
        return scanner.nextInt();

    }

    public int getInt(int min, int max) {
        int userInput = scanner.nextInt();

        if ( userInput < min || userInput> max ) {
            System.out.println("out of range.");
            getInt(min, max);
        } else {
            System.out.println("that works");
        }

        return userInput;
    }

//    double getDouble(){
//
//    }
//
//    double getDouble(double min, double max){
//
//    }

}
