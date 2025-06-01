import java.util.Random;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which elementary algoritms you want to use? 1 - My Bubble sort, 2 - Optimal Bubble Sort");
        int choice = scanner.nextInt();
        System.out.println("Which array size you want to use?");
        int size = scanner.nextInt();
        Random random = new Random();

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
                    ElementarySortingAlgorithms.myBubbleSort(array);
                    endTime = System.nanoTime();
                    break;
                case (2):
                    startTime = System.nanoTime();
                    ElementarySortingAlgorithms.opBubbleSort(array);
                    endTime = System.nanoTime();
                default:
                    startTime = System.nanoTime();
                    ElementarySortingAlgorithms.myBubbleSort(array);
                    endTime = System.nanoTime();
                    break;
            }

            double durationNano = endTime - startTime;
            double durationMillis = durationNano / 1_000_000.0;

            averageMS += durationMillis;
        }

        System.out.println("Sorting took, on average, " + averageMS/100 + " ms");
    }
}
