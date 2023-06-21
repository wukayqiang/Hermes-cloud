package com.hermes.cloud.springboot.sample.search;

public class BinarySearch {
    /**
     * 左开右闭区间：左边在范围内需要精确，右边不在范围内，可以需要扩大范围
     * @param arr
     * @param target
     * @return
     */
    public int binarySearch(int[] arr, int target) {
        if (arr[0] > target || arr[arr.length - 1] < target) {
            return -1;
        }
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                right = mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {1,3,5,7,8,9};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(arr,1));
    }
}
