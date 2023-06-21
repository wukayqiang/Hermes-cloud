package com.hermes.cloud.springboot.sample.sort;

public class SquareSort {
    public int[] squareSort(int[] arr) {
        int left = 0;
        int right = arr.length;
        int[] result = new int[arr.length];
        int index = right -1 ;
        while (left <= right) {
            if (arr[left] * arr[left] > arr[right] * arr[right]) {
                result[index--] = arr[left] * arr[left];
                left++;
            } else {
                result[index--] = arr[right] * arr[right];
                right--;
            }
        }
        return result;
    }
}
