
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int second = Integer.parseInt(reader.nextLine());
        
        int count = first;
        while (count <= second) {
            System.out.println(count);
            count++;
        }
    }
}
