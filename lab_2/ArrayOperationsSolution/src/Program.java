/**
 * Created by Acer on 17.09.2017.
 */
public class Program {
    public static void main(String[] args) {
        // solveOneDimensionalArray();
        solveMultiDimensionalArray();
    }

    private static void solveOneDimensionalArray(){
        ArrayInitializer arrayInitializer = new ArrayInitializer();

        int arraySize = arrayInitializer.requestArraySize();
        int[] array = arrayInitializer.initializeOneDimensionalArray(arraySize);

        OneDimensionalArraySolver oneDimensionalArraySolver = new OneDimensionalArraySolver(array);
        System.out.println("The number of positive items: " + oneDimensionalArraySolver.getCountOfPositive());
        System.out.println("Sum of elements larger than 3: " + oneDimensionalArraySolver.getSumOfLargerThanThree());
        System.out.println("Maximum element of array: " + oneDimensionalArraySolver.getMaximum());
        System.out.println("The number of negative items: " + oneDimensionalArraySolver.getCountOfNegative());
        System.out.println("The sum of negative items: " + oneDimensionalArraySolver.getSumOfNegative());
        System.out.println("The minimum element that is multiple 5: " + oneDimensionalArraySolver.getMinElementMultipleFive());
    }

    private static void solveMultiDimensionalArray(){
        ArrayInitializer arrayInitializer = new ArrayInitializer();

        int arraySize = arrayInitializer.requestArraySize();
        int[][] array = arrayInitializer.intializeTwoDimensionalArray(arraySize);

        TwoDimensionalArraySolver twoDimensionalArraySolver = new TwoDimensionalArraySolver(array);
        // twoDimensionalArraySolver.showArray();
        System.out.println(twoDimensionalArraySolver.getLeastElementOfMaxByModuleColumn());
    }
}
