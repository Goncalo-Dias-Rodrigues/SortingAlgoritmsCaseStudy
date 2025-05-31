import java.lang.reflect.Array;
import java.util.Arrays;

public class ElementarySortingAlgorithms {

    /**
     * This is my implementation of the Bubble Sort algorithm.
     * It isn't meant to be optimal.
     * @param array array to be sorted
     */
    public static void myBubbleSort(int[] array){
        int numberOfSwaps = 0;
        int originalNumberOfSwaps = numberOfSwaps;
        int temp;
        while(true){
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == originalNumberOfSwaps){
                break;
            }
            originalNumberOfSwaps = numberOfSwaps;
        }
    }
}
