import java.util.Random;
import java.util.Scanner;

public class ElementarySortingAlgorithms {

    public void bubbleSort(int[] array){
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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which elementary algoritms you want to use? 1 - Bubble sort");
        int choice = scanner.nextInt();
        System.out.println("Which array size you want to use?");
        int size = scanner.nextInt();
        ElementarySortingAlgorithms algortims = new ElementarySortingAlgorithms();
        Random random = new Random();

        double averageNS = 0;
        double averageSC = 0;
        double averageMS = 0;

        for (int i = 0; i < 100; i++) {
            int[] array = new int[size];

            for (int j = 0; j < array.length; j++) {
                array[j] = random.nextInt(0, 1001);
            }

            long startTime;
            long endTime;

            switch (choice) {
                case (1):
                    startTime = System.nanoTime();
                    algortims.bubbleSort(array);
                    endTime = System.nanoTime();
                    break;
                default:
                    startTime = System.nanoTime();
                    algortims.bubbleSort(array);
                    endTime = System.nanoTime();
                    break;
            }

            double durationNano = endTime - startTime;
            double durationSeconds = durationNano / 1_000_000_000.0;
            double durationMillis = durationNano / 1_000_000.0;

            averageNS += durationNano;
            averageSC += durationSeconds;
            averageMS += durationMillis;
        }

        System.out.println("Sorting took, on average, " + averageNS/100 + " ns");
        System.out.println("Sorting took, on average, " + averageSC/100 + " sec");
        System.out.println("Sorting took, on average, " + averageMS/100 + " ms");
    }
}
