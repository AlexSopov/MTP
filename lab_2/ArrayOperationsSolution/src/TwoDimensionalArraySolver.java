/**
 * Created by Acer on 17.09.2017.
 */
class TwoDimensionalArraySolver {
    private int[][] arrayData;

    TwoDimensionalArraySolver(int[][] data) {
        arrayData = data;
    }

    int getLeastElementOfMaxByModuleColumn() {
        int [] dataOfMaxByModuleColumn = new int[arrayData[0].length];
        int maxByModuleColumn = getMaxByModuleColumn();

        for (int i = 0; i < arrayData[0].length; i++) {
            dataOfMaxByModuleColumn[i] = arrayData[i][maxByModuleColumn];
        }

        return getMin(dataOfMaxByModuleColumn);
    }

    void showArray() {
        for (int i = 0; i < arrayData[0].length; i++) {
            for (int j = 0; j < arrayData[1].length; j++) {
                System.out.print(arrayData[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private int getMaxByModuleColumn(){
        int[] moduleColumnSum = new int[arrayData[1].length];

        for (int i = 0; i < arrayData[0].length; i++) {
            for (int j = 0; j < arrayData[1].length; j++) {
                moduleColumnSum[j] += Math.abs(arrayData[i][j]);
            }
        }

        return getIndexOfMax(moduleColumnSum);
    }

    private int getMin(int[] data) {
        int min = data[0];

        for (int value : data) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }
    private int getIndexOfMin(int[] data) {
        int min = getMin(data);

        for (int i = 0; i < data.length; i++) {
            if (data[i] == min) {
                return i;
            }
        }

        return -1;
    }
    private int getMax(int[] data) {
        int max = data[0];

        for (int value : data) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
    private int getIndexOfMax(int[] data) {
        int max = getMax(data);

        for (int i = 0; i < data.length; i++) {
            if (data[i] == max) {
                return i;
            }
        }

        return -1;
    }
}
