class ArrayPrinter {
    private ArrayPrinter() {}

    static void printArray(int[][] arrayData) {
        for (int i = 0; i < arrayData[0].length; i++) {
            for (int j = 0; j < arrayData[1].length; j++) {
                System.out.print(arrayData[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
    }
    static void printArray(int[] arrayData) {
        for (int value : arrayData) {
            System.out.print(value + "\t");
        }

        System.out.println();
    }
}
