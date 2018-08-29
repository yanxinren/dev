package com.ryx.others.dataStructure;

public class BinarySearch {
    /**
     * 1.二分查找以称折半查找，优点是比较次数少，查找速度快，平均性能好。
     * 2.其缺点是要求待查表为有序表。
     * 3.二分查找的目的是查找元素索引，有个前提是数组元素必须为有序。
     * 获取某个数在数组里出现在位置
     *
     * @param arr // 数组
     * @param num // 要找的数
     * @return
     */
    public static int getIndex(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;
        System.out.println("min: " + min + " mid: " + mid + " max: " + max);

        // 查找的算法
        int index = -1; // 如果算到最后，index人值没有改变，代表num在arr中不存在

        while (true) {

            if (arr[mid] == num) {// 找到查找的数
                index = mid;
                break;
            }

            if (arr[mid] > num) {// num 在左边
                max = mid - 1;
                mid = (min + max) / 2;
            }

            if (arr[mid] < num) {// num 在右边
                min = mid + 1;
                mid = (min + max) / 2;
            }

            if (min > max) { // 不符合逻辑
                break;// 退出循环
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 89, 34, 66};
        int num = 33;
        if (getIndex(arr, num) == -1) {
            System.out.println(num + " 在数组中不存在");
        } else {
            System.out.println(num + "索引位置: " + getIndex(arr, num)); //33索引位置: 2
        }
    }
}