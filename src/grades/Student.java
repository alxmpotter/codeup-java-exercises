package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    //ArrayList<Integer> is data type
    private ArrayList<Integer> grades;

    //constructor initializes grades as an empty array
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(){

    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverages(){
        double sum = 0;
        for(Integer average : grades){
            sum += average;
        }
        return sum / grades.size();
    }

    public static void main(String[] args){
        Student name = new Student("Alex");

        name.addGrade(78);
        name.addGrade(86);
        name.addGrade(45);
        name.addGrade(88);
        name.addGrade(100);
        name.addGrade(58);
        name.addGrade(91);

        name.getGradeAverages();
        System.out.println("List of grades: " + name.grades);
        System.out.println("The grade average is " + name.getGradeAverages());


    }


}
