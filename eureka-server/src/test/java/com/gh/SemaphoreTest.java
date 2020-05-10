package com.gh;

import java.util.concurrent.Semaphore;

/**
 * @author GuoHui
 * @Date 2020/4/18
 */
public class SemaphoreTest implements Runnable {

    private static Semaphore semaphore=new Semaphore(10,true);

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        semaphore.release();

    }
}
