import java.util.Arrays;


class OneDimensionalArraySolver {
    private int[] arrayData;
    private int[] sortedData;

    OneDimensionalArraySolver(int[] data) {
        arrayData = data;

        sortedData = new int[arrayData.length];
        System.arraycopy(arrayData, 0, sortedData, 0, arrayData.length );
        Arrays.sort(sortedData);
    }

    int getCountOfPositive() {
        int count = 0;
        for (int i = sortedData.length - 1; i >= 0; i--) {
            if (sortedData[i] > 0) {
                count++;
            }
            else {
                break;
            }
        }

        return count;
    }
    int getSumOfLargerThanThree() {
        int sum = 0;
        for (int value : arrayData) {
            if (value > 3) {
                sum += value;
            }
        }

        return sum;
    }
    int getMaximum() {
        return sortedData[sortedData.length - 1];
    }
    int getCountOfNegative() {
        int count = 0;
        for (int aSortedData : sortedData) {
            if (aSortedData < 0) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
    int getSumOfNegative() {
        int sum = 0;
        for (int aSortedData : sortedData) {
            if (aSortedData < 0) {
                sum += aSortedData;
            } else {
                break;
            }
        }

        return sum;
    }
    int getMinElementMultipleFive() {
        int min = arrayData[0];
        boolean isFound = false;

        for (int value : arrayData) {
            if (value % 5 == 0 && value < min) {
                min = value;
                isFound = true;
            }
        }

        return isFound ? min : 0;
    }
}
