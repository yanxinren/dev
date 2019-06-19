package com.ryx.datastructure;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Description: 数据结构学习整理
 * @Author: 601704
 * @Date: 2019/6/18 20:41
 */
public class Datastructure {
    /**
     * 方法功能描述:  假设现在有一个表存在100000条数据（数字）
     * 现在需要去除所有数据类型为偶数的数据
     * 采用正确的方法   节省时间
     *
     * @param:
     * @return:
     * @author: 601704
     * @date: 2019/6/18 20:42
     */
    static {
        ArrayList<Integer> arr = new ArrayList<>();

        //当表的容量比较大时，势必会带来add效率问题，容量比较大时，虚拟机的默认堆空间可能不足以支撑需求，此时必须增加堆空间
        int size=50000000;
        int maxValue = Integer.MAX_VALUE;
       // size=maxValue/2;
        System.out.println(maxValue);
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("数组添加"+size+"条数据的时间为:"+(int)(end-start));
        LinkedList<Integer> arr1 = new LinkedList<>();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr1.add(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("链表添加"+size+"条数据的时间为:"+(int)(end1-start1));
    }

    public static ArrayList<Integer> getArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        int size=1000000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
          arr.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("数组添加"+size+"条数据的时间为"+(int)(end-start));
      return  arr;

    }
    public static LinkedList<Integer> getLinkedList() {
        LinkedList<Integer> arr = new LinkedList<>();
        int size=1000000000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("链表添加"+size+"条数据的时间为"+(int)(end-start));
        return  arr;

    }

    public static void main(String[] args) {
        //  获取数组
        // 获取数组后执行三种方式对比
/*

        List<Integer> list = getArray();
        List<Integer> list1 = getArray();
        List<Integer> list2 = getArray();
        //以下代码会带来异常  --原因是当一项被删时  怎强的for循环是非法的
        System.out.println("数组时间:"+ getRemoveListTime(list));
     //  System.out.println("数组时间:"+ getRemoveListTime1(list1));
        System.out.println("数组时间:"+ getRemoveListTime2(list2));

        List<Integer> list4 = getLinkedList();
        List<Integer> list5 = getLinkedList();
        List<Integer> list6 = getLinkedList();
        //以下代码会带来异常  --原因是当一项被删时  怎强的for循环是非法的
        System.out.println("链表时间:"+ getRemoveListTime(list4));
   //     System.out.println("链表时间:"+ getRemoveListTime1(list5));
        System.out.println("链表时间:"+ getRemoveListTime2(list6));
*/

    }


    public static Long getRemoveListTime(List<Integer> a) {
        /**
         * 以下方法有一个问题
         * 对于ArrayList来说  remove的效率比较底下  以为到底下标的代价比较高
         * 对于LinkedList来说  get的效率比较底下  数据量比较大的时候要花费二次的时间
         */
        long start = System.currentTimeMillis();
        {
            int i = 0;
            while (i < a.size()) {
                if (a.get(i) % 2 == 0) {
                    a.remove(i);
                } else {
                    i++;
                }
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static Long getRemoveListTime1(List<Integer> a) {

        long start = System.currentTimeMillis();
        {
           for (Integer x:a){
               if (x%2==0){
                   a.remove(x);
               }
           }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static Long getRemoveListTime2(List<Integer> a) {
        /**
         * 以下方法有一个问题
         * 对于ArrayList来说  remove的效率比较底下  以为到底下标的代价比较高
         * 对于LinkedList来说  get的效率比较底下  数据量比较大的时候要花费二次的时间
         */
        long start = System.currentTimeMillis();
        {
            Iterator<Integer> iterator = a.iterator();
            while (iterator.hasNext()){
                if (iterator.next()%2==0){
                    iterator.remove();
                }
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
