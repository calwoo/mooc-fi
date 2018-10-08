
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        
        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("studentnumber: ");
            String number = reader.nextLine();
            Student stud = new Student(name, number);
            students.add(stud);
        }
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");
        for (Student stud : students) {
            if (stud.getName().contains(term)) {
                System.out.println(stud);
            }
        }
    }
}
