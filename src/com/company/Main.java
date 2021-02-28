package com.company;

import com.company.sort.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int[] mas = {1};
        int[] mas = {3, 0, 4, 1, 5, 9, 2, 6};
//        int[] mas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        printResult(mas, new BubbleSort());
        printResult(mas, new SelectionSort());
        printResult(mas, new InsertionSort());
        printResult(mas, new ShellSort());
        printResult(mas, new ShellHibbardSort());
        printResult(mas, new ShellFrankLazarusSort());
        printResult(mas, new HeapSort());
    }

    private static void printResult(int[] mas, Sort sort) {
        int[] result = sort.sort(mas);
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
