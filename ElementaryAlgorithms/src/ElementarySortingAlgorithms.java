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

    /**
     * GFG Bubble sort implementation
     * @param arr
     */
    static void opBubbleSort(int[] arr){
        int i, j, temp;
        boolean swapped;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }
}
