package com.ryx.others.dataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ryx
 * @ProjectName demo
 * @Description: 对数组进行冒泡排序
 * @date 2018/8/29 002915:03
 */
public class SelectSot {

    /**
     * 方法功能描述:  所谓冒泡就是   让后面的一个值与前面的值进行比较   不符合要求就变换位置
     *
     * @param: 要进行冒泡的数组   如果flag的值为true那么就是   从小到大递增的排序
     * @return: 排序的数组
     * @auther: ryx
     * @date: 2018/8/29 0029 15:05
     */
    public static int[] sort(int[] arr, boolean flag) {
        for (int i = 0; i < arr.length; i++) {
            // 这里吧i   当做数组的下标
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                // j  代表下一个数组元素的下标
                // 升序排序
                if (flag) {
                    //也就是前一个下标中的元素大于后一个数组中的元素， 这种情况下  后面元素不愿意了 ，你身高
                    if (arr[index] > arr[j]) {
                        //  让index指向下一个元素节点
                        index = j;
                    }
                } else {
                    //也就是前一个下标
                    if (arr[index] < arr[j]) {
                        //  让index指向下一个元素节点
                        index = j;
                    }
                }
            }
            //  这个判断条件是因为符合了交换下标的条件
            if (index != i) {
                swap(arr, i, index);
            }
        }
        return arr;
    }

    // 根据下标交换位置的方法   不要被变量迷惑  这个变量的意思是只要不符合判断规则了 ，那么就变换位置
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 52, 2, 2, 23, 4, 2, 3, 4, 2, 3, 4, 2, 3, 43};
        //  数组的toString方法
        System.out.println("排序之前：" + Arrays.toString(arr));
        //升序排序
        System.out.println("升序排序" + Arrays.toString(sort(arr, true)) + "\t");

        System.out.println("降序排序：" + Arrays.toString(sort(arr, false)));
    }

}
