import java.util.Random;

public class ServerNameGenerator {
    public static String getRandom(){
        String[] adjectives =
                {"shiny", "slimy", "small", "old", "big", "young", "fancy", "ugly", "pretty", "wrinkled"};

        String[] nouns =
                {"lamp", "desk", "pen", "notebook", "computer", "book", "shoe", "chair", "rug", "hat"};

        Random randomAdj = new Random();
        int index = randomAdj.nextInt(adjectives.length);
        return adjectives[index];

    }


    public static void main(String[] args) {
        System.out.println(ServerNameGenerator.getRandom());


    }
}
