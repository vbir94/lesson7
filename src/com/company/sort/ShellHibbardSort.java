package com.company.sort;

import java.util.Arrays;

public class ShellHibbardSort extends ShellSort{

    int[] arr;

    @Override
    public int[] sort(int[] mas) {
        this.arr = Arrays.copyOf(mas, mas.length);
        for(int k = log2(arr.length); k > 0; k--) {
            int gap = hibard(k);
            arr = innerSort(arr, gap);
        }
        return arr;
    }

    private int log2(int k) {
        return (int)(Math.log(k) / Math.log(2));
    }

    private int hibard(int k) {
        return (int) Math.pow(2, k) - 1;
    }

}
