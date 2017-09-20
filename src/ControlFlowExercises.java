import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
////////while loop count form 5 to 15
//
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

///////do while loop, count backwards from 5

//       int i = 100;
//
//       do{
//           System.out.println(i);
//           i = i - 5;
//       } while(i >= -10);

/////////do while number squared

//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);

////////////for loops

//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//
//        for(int i = 0; i < 100; i += 2){
//            System.out.println(i);
//        }
//
//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

///////////Fizzbuzz

//          for(int i = 1; i <= 100; i++){
//
//              if(i % 3 != 0 && i % 5 != 0){
//                System.out.print(i);
//              }
//
//              if(i % 3 == 0){
//                  System.out.print("fizz");
//              }
//
//              if(i % 5 ==0){
//                  System.out.print("buzz");
//              }
//
//              System.out.println();
//
//          }

////////////////Table of Powers

        int userInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to square and cube.");
        userInput = scan.nextInt();
        System.out.println(userInput);

//        String header = String.format("|%6s|", "number", "|%8s|", "squared");
//        System.out.printf("|%6s", " number ");
//        System.out.printf("|%8s", " squared ");
//        System.out.printf("|%7s|", " cubed ");
//        System.out.println();
//        System.out.printf("|%26s|", " ------------- ");
//        System.out.printf("%8s", " ------ ");
//        System.out.printf("%7s", " ------ ");

        System.out.println(String.format("|%6s", " number "));


    }
}
