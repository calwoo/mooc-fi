
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int count = 0;
        while (count <= num) {
            sum += (int)Math.pow(2, count);
            count++;
        }
        System.out.println("The result is " + sum);
    }
}
