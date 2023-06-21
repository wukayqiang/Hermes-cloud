package com.hermes.cloud.utils.algorithm;

import java.util.Arrays;

public class SortUtils {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 2};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }
}
