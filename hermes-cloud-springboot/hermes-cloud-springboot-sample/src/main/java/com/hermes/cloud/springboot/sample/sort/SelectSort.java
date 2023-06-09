package com.hermes.cloud.springboot.sample.sort;

import java.util.Arrays;

public class SelectSort {
    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 7, 8, 4};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
