package com.gh;

/**
 * @author GuoHui
 * @Date 2020/4/14
 */
public class SortTest2 {

    public static void main(String[] args){
        int[] array={3,1,2,8,6,4,5};
        int len=array.length;
        int c;
//        for (int i = 0; i <len ; i++) {
//            for(int o=i+1;o<len;o++){
//              if(array[i]>array[o]){
//                  c=array[i];
//                  array[i]=array[o];
//                  array[o]=c;
//              }
//            }
//        }
        for(int m=0;m<len;m++){
            for(int n=0;n<len-m-1;n++){
                if(array[n]>array[n+1]){
                    c=array[n+1];
                    array[n+1]=array[n];
                    array[n]=c;
                }
            }


        }


        for(int i=0;i<len;i++){
            System.out.print(array[i]+" ");
        }




    }



}
