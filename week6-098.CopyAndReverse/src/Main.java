

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy(int[] array) {
        int length = array.length;
        int[] copy = new int[length];
        for (int i = 0; i < length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }
    
    public static int[] reverseCopy(int[] array) {
        int length = array.length;
        int[] copy = new int[length];
        for (int i = 0; i < length; i++) {
            copy[i] = array[length - i - 1];
        }
        return copy;
    }
    
}
