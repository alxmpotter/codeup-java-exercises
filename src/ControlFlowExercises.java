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

//        int i = 2;
//
//        do {
//            System.out.println(i);
//            i = i^2;
//            i++;
//        } while(i < 1000);

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

/////////////Fizzbuzz

          for(int i = 1; i <= 100; i++){
              if(i % 3 == 0){
                  System.out.println(i + " fizz");
              }

              if(i % 5 ==0){
                  System.out.println(i + " buzz");
              }

              if(i % 3 == 0 && i % 5 == 0){
                  System.out.println(i + " fizzbuzz");
              }
          }


    }
}
