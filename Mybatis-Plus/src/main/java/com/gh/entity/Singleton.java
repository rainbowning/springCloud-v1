package com.gh.entity;

/**
 * @author GuoHui
 * @Date 2020/4/17
 */
public  class Singleton {
    //懒汉式
//    private static Singleton singleton;
//
//    private Singleton(){

//    }
//
//    public static synchronized Singleton getInstance(){
//        if(singleton==null){
//            singleton=new Singleton();
//        }
//        return singleton;
//    }

    //饿汉式
//    private static Singleton singleton=new Singleton();
//
//    private Singleton(){
//
//    }
//    public static Singleton getInstance(){
//        return singleton;
//    }

    //双重保险
//    private static volatile Singleton singleton;
//
//    private Singleton(){
//
//    }
//    public static Singleton getInstance(){
//        if(singleton==null){
//            synchronized (Singleton.class){
//                if(singleton==null){
//                    singleton=new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }


    //内部类
    private Singleton(){

    }
    private static class SingletonHolder{
        private static Singleton singleton=new Singleton();
    }
    public static Singleton getInstance(){
        return  SingletonHolder.singleton;
    }

}
