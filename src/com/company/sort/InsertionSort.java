package com.company.sort;

import java.util.Arrays;

public class InsertionSort implements Sort {

    int[] arr;

    @Override
    public int[] sort(int[] mas) {
        this.arr = Arrays.copyOf(mas, mas.length);
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > x) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = x;
        }
        return arr;
    }
}
