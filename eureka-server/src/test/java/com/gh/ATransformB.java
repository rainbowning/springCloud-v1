package com.gh;

/**
 * @author GuoHui
 * @Date 2020/4/12
 */
public class ATransformB {
    public static void main(String[] args){
        int a=3;
        int b=4;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"==="+b);


    }
}
