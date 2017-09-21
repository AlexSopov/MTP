public class Program {
    public static void main(String[] args) {
        solveOneDimensionalArray();
        solveMultiDimensionalArray();
    }

    private static void solveOneDimensionalArray() {
        ArrayInitializer arrayInitializer = new ArrayInitializer();

        int arraySize = arrayInitializer.requestArraySize();
        int[] array = arrayInitializer.initializeOneDimensionalArray(arraySize);

        ArrayPrinter.printArray(array);
        OneDimensionalArraySolver oneDimensionalArraySolver = new OneDimensionalArraySolver(array);

        System.out.println("The number of positive items: " + oneDimensionalArraySolver.getCountOfPositive());
        System.out.println("Sum of elements larger than 3: " + oneDimensionalArraySolver.getSumOfLargerThanThree());
        System.out.println("Maximum element of array: " + oneDimensionalArraySolver.getMaximum());
        System.out.println("The number of negative items: " + oneDimensionalArraySolver.getCountOfNegative());
        System.out.println("The sum of negative items: " + oneDimensionalArraySolver.getSumOfNegative());
        System.out.println("The minimum element that is multiple 5: " + oneDimensionalArraySolver.getMinElementMultipleFive());
    }

    private static void solveMultiDimensionalArray() {
        System.out.println();
        ArrayInitializer arrayInitializer = new ArrayInitializer();

        // 8 - by task
        int[][] array1 = arrayInitializer.initializeTwoDimensionalArray(8);
        ArrayPrinter.printArray(array1);
        TwoDimensionalArraySolver twoDimensionalArraySolver = new TwoDimensionalArraySolver(array1);
        System.out.println("The least element of max by module column: " + twoDimensionalArraySolver.getLeastElementOfMaxByModuleColumn());

        int arraySize = arrayInitializer.requestArraySize();
        int[][] array2 = arrayInitializer.initializeTwoDimensionalArray(arraySize);

        ArrayPrinter.printArray(array2);
        twoDimensionalArraySolver = new TwoDimensionalArraySolver(array2);

        System.out.println("Minimums to diagonal: ");
        ArrayPrinter.printArray(twoDimensionalArraySolver.getMinimumsToDiagonal());

        System.out.println("\nFirst positives to diagonal: ");
        ArrayPrinter.printArray(twoDimensionalArraySolver.getFirstPositivesToDiagonal());
    }
}
