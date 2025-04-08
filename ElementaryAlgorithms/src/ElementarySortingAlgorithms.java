import java.util.Random;

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
        ElementarySortingAlgorithms algorithms = new ElementarySortingAlgorithms();
        int[] array = new int[1000];
        double averageNS = 0;
        double averageSC = 0;
        double averageMIN = 0;

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                Random random = new Random();
                array[j] = random.nextInt(0, 1001);
            }

            long startTime = System.nanoTime();
            algorithms.bubbleSort(array);
            long endTime = System.nanoTime();
            double durationNano = endTime - startTime;
            double durationSeconds = durationNano / 1_000_000_000.0;
            double durationMinutes = durationSeconds / 60.0;

            averageNS += durationNano;
            averageSC += durationSeconds;
            averageMIN += durationMinutes;
        }

        System.out.println("Sorting took, on average, " + averageNS/1000 + " ns");
        System.out.println("Sorting took, on average, " + averageSC/1000 + " sec");
        System.out.println("Sorting took, on average, " + averageMIN/1000 + " min");


    }
}