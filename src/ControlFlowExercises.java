public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }


        System.out.println("Count by two:");
        int evenNumber = 0;

        do {
            System.out.println(evenNumber);
            evenNumber = evenNumber + 2;
        } while (evenNumber <= 100);
    }
}
