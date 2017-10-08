import ArraySorting.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class SortingMethodsTest {
    private static Integer[] source;
    private Integer[] temporarySource;

    @BeforeClass
    public static void initialize() {
        Random random = new Random();

        source = new Integer[10];
        for (int i = 0; i < source.length; i++) {
            source[i] = random.nextInt() % 100;
        }
    }

    @Before
    public  void  before() {
        temporarySource = Arrays.copyOf(source, source.length);
    }

    @After
    public void  after() {
        for (int i = 1; i < temporarySource.length; i++ ) {
            assertTrue("Array is not sorted", temporarySource[i] >= temporarySource[i - 1]);
        }
    }

    @Test
    public void bubbleSortSortsArrayTest() {
        sort(new BubbleSorter(), temporarySource);
    }

    @Test
    public void cycleSortSortsArrayTest() {
        sort(new CycleSorter(), temporarySource);
    }

    @Test
    public void insertionSortSortsArrayTest() {
        sort(new InsertionSort(), temporarySource);
    }

    @Test
    public void javaNativeSortSortsArrayTest() {
        sort(new JavaNativeSort(), temporarySource);
    }

    @Test
    public void quickSortSortsArrayTest() {
        sort(new QuickSorter(), temporarySource);
    }

    @Test
    public void shellSortSortsArrayTest() {
        sort(new ShellSort(), temporarySource);
    }

    private void sort(Sortable sortable, Integer[] source) {
        sortable.sort(source);
    }
}
