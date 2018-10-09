
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
    
    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println(array);
            int index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, index);
        }
        System.out.println(array);
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int min = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = index;
        for (int i=min; i<array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
