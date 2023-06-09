package com.hermes.cloud.springboot.sample.search;

public class RemoveElement {

    /**
     * 暴力破解
     * @param arr
     * @param val
     * @return
     */
    public int removeElementDouble(int[] arr, int val) {
        int size = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                size--;
                for (int j = i; j < arr.length; j++) {
                    arr[j-1] = arr[j];
                }
            }
        }
        return size;
    }

    /**
     * 双向指针
     * @param arr
     * @param val
     * @return
     */
    public int removeElementDoublePointer(int[] arr, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < arr.length; fastIndex++) {
            if (arr[fastIndex] != val) {
                arr[slowIndex++] = arr[fastIndex];
            }
        }
        return slowIndex;
    }
}
