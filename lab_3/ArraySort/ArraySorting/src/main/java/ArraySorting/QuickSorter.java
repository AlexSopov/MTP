package ArraySorting;

import java.util.Comparator;

public class QuickSorter extends Sortable {
    @Override
    protected <T> void processSorting(T[] source, Comparator<T> comparator) {
        quickSort(source, 0, source.length - 1, comparator);
    }

    private <T> void quickSort(T[] source, int leftLimit, int rightLimit, Comparator<T> comparator) {
        int middleIndex = (leftLimit + rightLimit) / 2;
        int index1 = leftLimit;
        int index2 = rightLimit;

        while (index1 <= index2)
        {
            while (index1 < rightLimit && compare(source, index1, middleIndex, comparator) < 0) {
                index1++;
            }
            while (index2 > leftLimit && compare(source, index2, middleIndex, comparator) > 0) {
                index2--;
            }

            if (index1 <= index2)
            {
                if (index1 < index2)
                {
                    T value = source[index1];
                    source[index1] = source[index2];
                    source[index2] = value;
                }
                index1++;
                index2--;
            }
        }

        if (index1 < rightLimit) {
            quickSort(source, index1, rightLimit, comparator);
        }
        if (index2 > leftLimit) {
            quickSort(source, leftLimit, index2, comparator);
        }
    }
}
