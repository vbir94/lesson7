package com.company.sort;

import java.util.Arrays;

public class HeapSort implements Sort {

    int[] arr;

    public int[] sort(int[] mas) {
        this.arr = Arrays.copyOf(mas, mas.length);
        for (int root = arr.length / 2 - 1; root >= 0; root--) {
            moveMaxToRoot(root, arr.length);
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            swap(0, j);
            moveMaxToRoot(0, j);
        }
        return arr;
    }

    private void moveMaxToRoot(int root, int size) {
        int L = 2 * root + 1;
        int R = L + 1;
        int X = root;
        if (L < size && arr[L] > arr[X]) {
            X = L;
        }
        if (R < size && arr[R] > arr[X]) {
            X = R;
        }
        if (X == root) return;
        swap(X, root);
        moveMaxToRoot(X, size);
    }

    private void swap(int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

}
