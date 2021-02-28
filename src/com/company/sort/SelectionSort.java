package com.company.sort;

import java.util.Arrays;

public class SelectionSort implements Sort {

    int[] arr;

    public int[] sort(int[] mas) {
        this.arr = Arrays.copyOf(mas, mas.length);
        moveMaxToRoot(0, arr.length);
        for (int j = arr.length - 1; j >= 0; j--) {
            swap(0, j);
            moveMaxToRoot(0, j);
        }
        return arr;
    }

    private void moveMaxToRoot(int root, int size) {
        for (int i = root + 1; i < size; i++) {
            if (arr[i] > arr[root])
                swap(root, i);
        }
    }

    private void swap(int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

}
