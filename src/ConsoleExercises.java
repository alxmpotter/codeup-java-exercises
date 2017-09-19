import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        int userNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        userNumber = scan.nextInt();
        System.out.println(userNumber);

        String firstWord, secondWord, thirdWord;
        System.out.println("Enter Three words.");
        firstWord = scan.next();
        System.out.println(firstWord);
        secondWord = scan.next();
        System.out.println(secondWord);
        thirdWord = scan.next();
        System.out.println(thirdWord);

    }

}
