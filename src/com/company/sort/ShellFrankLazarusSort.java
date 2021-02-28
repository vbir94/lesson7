package com.company.sort;

import java.util.Arrays;

public class ShellFrankLazarusSort extends ShellSort{

    int[] arr;

    @Override
    public int[] sort(int[] mas) {
        this.arr = Arrays.copyOf(mas, mas.length);
        int k = -1;
        int gap;
        do {
            gap = gap(++k, arr.length);
            arr = innerSort(arr, gap);
        } while (gap != 1);
        return arr;
    }

    private int gap(int k, int n) {
        return 2 * (n / (int) Math.pow(2, k + 1)) + 1;
    }

}
