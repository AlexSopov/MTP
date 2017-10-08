package ArraySorting;

import java.util.Comparator;

public class InsertionSort extends Sortable {
    @Override
    protected <T> void processSorting(T[] source, Comparator<T> comparator) {
        for (int i = 1; i < source.length; i++) {
            int j = i - 1;

            while (j >= 0 && compare(source, j, i, comparator) > 0) {
                source[j + 1] = source[j];
                j--;
            }
            source[j + 1] = source[i];
        }
    }
}
