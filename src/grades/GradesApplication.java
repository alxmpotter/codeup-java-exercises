package grades;
import java.util.HashMap;
import util.Input;
//import java.util.ArrayList;
//import java.util.Map;

public class GradesApplication extends Student {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        //var obj = {
        //      "key" : {} <--Student Object, represents value
        // }

        Student alex = new Student("Alex");
        Student luis = new Student("Luis");
        Student fer = new Student("Fer");

        alex.addGrade(87);
        alex.addGrade(75);
        alex.addGrade(65);

        luis.addGrade(100);
        luis.addGrade(95);
        luis.addGrade(92);

        fer.addGrade(80);
        fer.addGrade(85);
        fer.addGrade(88);

        students.put("alxmpotter", alex);
        students.put("LuisMontealegre", luis);
        students.put("FernandoMendoza", fer);

        System.out.println("Github user-names: \n");

        for(String usernames : students.keySet()){
            System.out.print(" |" + usernames + "|");
        }


        Input input = new Input();
//        Input input2 = new Input();
//        String keyValue = input.getString();
//
        while(true){
            System.out.println("Would you like to continue?");
            if(!input.yesNo("")){

            }
        }

//            do {
//                if(students.get(keyValue) ==  ){
//                    System.out.println("Name: " + students.get(keyValue).getName() + "\ngrade average: " + students.get(keyValue).getGradeAverages());
//                } else {
//                    System.out.println(keyValue + " is not a current student");
//                }
//            } while(input2.yesNo("Would you like to continue?"));

    }
}
