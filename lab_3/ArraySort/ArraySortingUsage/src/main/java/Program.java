import ArraySorting.*;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Integer[] data = initializeRandomArray(10000);

        SortingMetricsCollector sortingMetricsCollector = new SortingMetricsCollector();
        sortingMetricsCollector.getMetricsForSort(new BubbleSorter(), data);
        sortingMetricsCollector.getMetricsForSort(new InsertionSort(), data);
        sortingMetricsCollector.getMetricsForSort(new QuickSorter(), data);
        sortingMetricsCollector.getMetricsForSort(new CycleSorter(), data);
        sortingMetricsCollector.getMetricsForSort(new ShellSort(), data);
        sortingMetricsCollector.getMetricsForSort(new JavaNativeSort(), data);
    }

    private static Integer[] initializeRandomArray(int length) {
        Random random = new Random();

        Integer[] result = new Integer[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt() % 100;
        }

        return result;
    }
}
