import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String reversedText = reverse(text);
        
        return text.equals(reversedText);
    }
    
    public static String reverse(String text) {
        String reversed = "";
        int count = text.length() - 1;
        while (count >= 0) {
            reversed += text.charAt(count);
            count--;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
