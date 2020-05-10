package com.gh;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GuoHui
 * @Date 2020/4/13
 */
public class SortTest {
    public static void main(String[] args) {

        int[] array = {1,3,9,2,4,5,6,7};
        int len = array.length;
        System.out.println("数组长度===》" + len);
        int c;
        //选择排序
//        for(int a=0;a<len;a++){
//            for(int b=a+1;b<len;b++){
//                if(array[a]>array[b]){
//                    c=array[a];
//                    array[a]=array[b];
//                    array[b]=c;
//                }
//            }
//        }

        //冒泡排序
        for (int m = 0; m < len; m++) {
            for (int n = 0; n < len - m - 1; n++) {
                if (array[n] > array[n + 1]) {
                    c = array[n];
                    array[n] = array[n + 1];
                    array[n + 1] = c;
                }
            }

        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("数组长度===》" + array.length);

        //二分法

        int index = getIndex(array, 6);
        System.out.println(index);
        System.out.println(1/2);
        System.out.println(2/2);
        System.out.println(3/2);
        System.out.println(4/2);
        System.out.println(5/2);

        HashMap<String,Integer> map=new HashMap<>();
        map.put("String",12);
    }


    /*
         * 二分查找
         * 1,返回值类型,int
         * 2,参数列表int[] arr,int value
         */
    public static int getIndex(int[] arr, int value) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;

        while (arr[mid] != value) {             //当中间值不等于要找的值,就开始循环查找
            if (arr[mid] < value) {             //当中间值小于了要找的值
                min = mid + 1;                  //最小的索引改变
            } else if (arr[mid] > value) {      //当中间值大于了要找的值
                max = mid - 1;                  //最大的索引改变
            }
            mid = (min + max) / 2;              //无论最大还是最小改变,中间索引都会随之改变
            if (min > max) {                    //如果最小索引大于了最大 索引,就没有查找的可能性了
                return -1;                      //返回-1
            }
        }
        return mid;
    }
}
