package com.gh;

import org.apache.commons.codec.digest.DigestUtils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @author GuoHui
 * @Date 2020/5/7
 */
public class MD5Test {

//    public static void main(String[] args){

//        String s = DigestUtils.md5Hex("666666");
//        System.out.println(s.toUpperCase());
//        String md="F379EAF3C831B04DE153469D1BEC345E";


//    }

    /**
     * BASE64解密
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * BASE64加密
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    public static void main(String[] args) {

        String  str="这个是一个Base64加密";
        try {
            String  result1= MD5Test.encryptBASE64(str.getBytes());
            System.out.println("result1=====加密数据:"+result1);
            byte  result2[]= MD5Test.decryptBASE64(result1);
            String  str2=new String(result2);
            System.out.println("str2========解密数据:"+str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
