package com.gh;

/**
 * @author GuoHui
 * @Date 2020/4/11
 */
public class SyncThread implements Runnable {
    private static Integer count;

    public SyncThread() {
        count = 0;
    }

    public  void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
//                    this.wait();
//                    System.out.println("xiumian");
//                    Thread.sleep(30000);
//                    this.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    public int getCount() {
//        return count;
//    }
}
