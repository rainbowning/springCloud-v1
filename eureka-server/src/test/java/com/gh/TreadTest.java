package com.gh;

/**
 * @author GuoHui
 * @Date 2020/4/11
 */


public class TreadTest {

    private static int count=0;

    public static void main(String[] args){
//        test01
//        SyncThread s1 = new SyncThread();
//        SyncThread s2 = new SyncThread();
//        Thread t1 = new Thread(s1);
//        Thread t2 = new Thread(s2);
//        test02
//        SyncThread s = new SyncThread();
//        Thread t1 = new Thread(s,"A");
//        Thread t2 = new Thread(s,"B");
//
//        t1.start();
//        t2.start();
//        for(int i=0;i<50;i++){
//            System.out.println(count++);
//        }

        SemaphoreTest semaphoreTest=new SemaphoreTest();
        for(int i=0;i<100;i++){
            Thread thread=new Thread(semaphoreTest);
            thread.start();
        }


    }

}
