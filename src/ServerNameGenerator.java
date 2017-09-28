import java.util.Random;

public class ServerNameGenerator {
        static String[] adjectives =
                {"shiny", "slimy", "small", "old", "big", "young", "fancy", "ugly", "pretty", "wrinkled"};

        static String[] nouns =
                {"lamp", "desk", "pen", "notebook", "computer", "book", "shoe", "chair", "rug", "hat"};

    public static String getRandom(String[] words){
        Random randomAdj = new Random();
        int index = randomAdj.nextInt(words.length);
        return words[index];

    }


    public static void main(String[] args) {
        System.out.println("Your server name is: " + getRandom(adjectives) + "-" + getRandom(nouns));


    }
}
