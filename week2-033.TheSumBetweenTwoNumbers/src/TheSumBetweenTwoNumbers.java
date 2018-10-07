
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("SecondL ");
        int second = Integer.parseInt(reader.nextLine());
        
        int count = first;
        int sum = 0;
        while (count <= second) {
            sum += count;
            count++;
        }
        System.out.println("The sum is " + sum);
    }
}
