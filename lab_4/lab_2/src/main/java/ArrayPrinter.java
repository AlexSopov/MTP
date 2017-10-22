class ArrayPrinter {
    String printArray(int[][] arrayData) {
        String result = "";

        for (int[] anArrayData : arrayData) {
            for (int anAnArrayData : anArrayData) {
                result += anAnArrayData + "\t";
            }
            result += "\n";
        }

        return  result;
    }
    String printArray(int[] arrayData) {
        String result = "";

        for (int value : arrayData) {
            result += value + "\t";
        }

        result += "\n";
        return  result;
    }
}
