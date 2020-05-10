package com.gh;

/**
 * @author GuoHui
 * @Date 2020/4/18
 */
public interface InterfaceC extends InterfaceA,InterfaceB  {

    @Override
    default void defaultType() {
        System.out.println("From CCCCC");
    }

}
