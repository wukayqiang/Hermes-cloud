package com.hermes.cloud.springboot.sample.sort;

import java.util.Arrays;

public class QuickSort {
    public void quickSort(int[] arr,int left,int right) {
        if (left < right) {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }

    public int partition(int[] arr, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        return index - 1;
    }

    public void swap(int[] arr,int left,int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,7,8,4};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
