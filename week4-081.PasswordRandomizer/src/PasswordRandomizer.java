import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passLength;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        for (int i = 0; i < this.passLength; i++) {
            int num = random.nextInt(26);
            password += "abcdefghijklmnopqrstuvwxyz".charAt(num);
        }
        return password;
    }
}
