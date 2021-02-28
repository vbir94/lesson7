package com.company.sort;

import java.util.Arrays;

public class BubbleSort implements Sort {

    private int[] arr;

    public int[] sort(int[] mas) {
        this.arr = Arrays.copyOf(mas, mas.length);
        System.arraycopy(mas, 0, arr, 0, mas.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) swap(i, j);
            }
        }
        return arr;
    }

    private void swap(int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
