package com.company.sort;

import java.util.Arrays;

public class ShellSort implements Sort{

    int[] arr;

    @Override
    public int[] sort(int[] mas) {
        this.arr = Arrays.copyOf(mas, mas.length);
        for (int gap = arr.length / 2; gap > 0 ; gap /= 2) {
            arr = innerSort(arr, gap);
        }
        return arr;
    }

    protected int[] innerSort(int[] mas, int gap) {
        int[] arr = Arrays.copyOf(mas, mas.length);
        for (int i = gap; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for(j = i; j >= gap && arr[j - gap] > tmp ; j -= gap) {
                arr[j] = arr[j - gap];
            }
            arr[j] = tmp;
        }
        return arr;
    }
}
