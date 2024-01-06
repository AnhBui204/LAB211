package controllers;

public class SearchAlgorithm {

    //Binary search
    public int binarySearch(int array[], int x) {

        int l = 0, r = array.length - 1;
        while (l <= r) {
            int m = (l + r - 1) / 2;
            if (array[m] == x) {
                return m;
            }
            if (x > array[m]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }

    //Linear search
    public int linearSearch(int array[], int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

}
