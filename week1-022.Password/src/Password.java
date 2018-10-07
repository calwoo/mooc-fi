
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        System.out.println("Type the password: ");
        String pass = reader.nextLine();
        while (true) {
            if (pass.equals(password)) {
                System.out.println("Right!");
                break;
            }
            else {
                System.out.println("Wrong!");
            }
            System.out.println("Type the password: ");
            pass = reader.nextLine();
        }
        System.out.println("The secret is: homotopy!");
    }
}
