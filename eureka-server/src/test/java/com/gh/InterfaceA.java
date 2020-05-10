package com.gh;

/**
 * @author GuoHui
 * @Date 2020/4/18
 */
public interface InterfaceA {

    public void AType();
    public void common();
    public default void defaultType(){
        System.out.println("From AAAAA");
    };
}
