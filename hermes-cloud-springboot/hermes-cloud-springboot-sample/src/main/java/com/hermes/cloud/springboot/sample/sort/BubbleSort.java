package com.hermes.cloud.springboot.sample.sort;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        for (int i = 1; i <= arr.length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,7,8,4};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
