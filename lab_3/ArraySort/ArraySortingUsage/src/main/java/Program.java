import ArraySorting.CycleSorter;
import ArraySorting.Sortable;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Sortable sortable = new CycleSorter();

        Integer[] data = initializeOneDimensionalArray(100);
        sortable.sort(data);
    }

    static Integer[] initializeOneDimensionalArray(int length) {
        Random random = new Random();

        Integer[] result = new Integer[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt() % 100;
        }

        return result;
    }
}
