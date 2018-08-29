package com.ryx.others.dataStructure;

import java.util.Arrays;

public class SelectSort {

    /**
     * 选择排序（Selection sort）是一种简单直观的排序算法。它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，
     * 存放在序列的起始位置，直到全部待排序的数据元素排完。
     * 选择排序是不稳定的排序方法（比如序列[5， 5， 3]第一次就将第一个[5]与[3]交换，导致第一个5挪动到第二个5后面）。
     * 选择排序
     *
     * @param arr 排序的数组
     * @param asc 是否升序
     */
    public static void sort(int[] arr, boolean asc) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (asc) {
                    if (arr[index] > arr[j]) { // 升序，选择无序区最小的元素
                        index = j;
                    }
                } else {
                    if (arr[index] < arr[j]) {// 降序，选择无序区最大的元素
                        index = j;
                    }
                }
            }
            if (index != i) {
                swap(arr, index, i);
            }
        }

    }

    /**
     * 交换数组中的两个元素的位置
     *
     * @param arr // 数组
     * @param i   // 变量i
     * @param j   // 变量j
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 8, 10, 34, 13, 56};
        System.out.println("排序数组：" + Arrays.toString(arr));
        sort(arr, true);
        System.out.println("升序排列：" + Arrays.toString(arr));
        sort(arr, false);
        System.out.println("降序排列：" + Arrays.toString(arr));

    }
}