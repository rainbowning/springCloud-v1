package com.gh;

import com.gh.entity.Singleton;

/**
 * @author GuoHui
 * @Date 2020/4/17
 */
public class SingletonTest {
    public static void main(String[] args){
        MyRunable myRunable = new MyRunable();
        for(int i=0;i<4;i++){
            Thread thread = new Thread(myRunable);
            thread.start();
        }

    }

    public static class MyRunable implements Runnable{
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }
    }
}

