import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int index = name.length() - 1;
        System.out.print("In reverse order: ");
        while (index >= 0) {
            System.out.print(name.charAt(index));
            index--;
        }
    }
}
