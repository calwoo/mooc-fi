import java.util.*;

public class Gradebook {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradeClass;
    private int totalAccepted;
    
    public Gradebook() {
        this.grades = new ArrayList<Integer>();
        this.gradeClass = new ArrayList<Integer>();
        this.totalAccepted = 0;
    }
    
    public void addGrade(int points) {
        this.grades.add(points);
        if (points <= 29) {
            this.gradeClass.add(0);
        }
        else if (points <= 34) {
            this.gradeClass.add(1);
            this.totalAccepted++;
        }
        else if (points <= 39) {
            this.gradeClass.add(2);   
            this.totalAccepted++;
        }
        else if (points <= 44) {
            this.gradeClass.add(3);
            this.totalAccepted++;
        }
        else if (points <= 49) {
            this.gradeClass.add(4);
            this.totalAccepted++;
        }
        else {
            this.gradeClass.add(5);
            this.totalAccepted++;
        }
    }
    
    public void printGradeHistogram(int grade) {
        for (int g : gradeClass) {
            if (g == grade) {
                System.out.print("*");
            }
        }
        System.out.print("\n");
    }
    
    public void printHistogram() {
        System.out.println("Grade distribution: ");
        for (int i = 5; i > -1; i--) {
            System.out.print(i + ": ");
            printGradeHistogram(i);
        }
        double acceptPercent = 100.0 * this.totalAccepted / this.gradeClass.size();
        System.out.println("Acceptance percentage: " + acceptPercent);
    }
}
