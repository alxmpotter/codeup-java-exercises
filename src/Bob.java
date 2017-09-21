import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        while(true) {

            String talkToBob;
            Scanner scan = new Scanner(System.in);
            System.out.println("Ask Bob a question.");
            talkToBob = scan.nextLine();

            String question = "?";

            if (talkToBob.endsWith(question)) {
                System.out.println("Sure.");
            } else if (talkToBob.equals(talkToBob.toUpperCase()) && !talkToBob.isEmpty() || talkToBob.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (talkToBob.isEmpty()) {
                System.out.println("Fine, be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Keep talking to Bob? y/n");
            String option = scan.nextLine();
            if(!option.equalsIgnoreCase("y")){
              break;
            }

        }

    }
}
