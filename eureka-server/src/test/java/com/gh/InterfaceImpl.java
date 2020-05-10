package com.gh;

/**
 * @author GuoHui
 * @Date 2020/4/18
 */
public class InterfaceImpl implements InterfaceC {
    @Override
    public void AType() {

    }

    @Override
    public void BType() {

    }

    @Override
    public void common() {

    }
    public static void main(String[] args){
        InterfaceImpl interfaceImple=new InterfaceImpl();
        interfaceImple.defaultType();
    }
}
