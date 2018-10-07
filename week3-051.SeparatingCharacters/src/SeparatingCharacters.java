
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int index = 1;
        while (index <= name.length()) {
            System.out.println(index + ". character: " + name.charAt(index - 1));
            index++;
        }
    }
}
