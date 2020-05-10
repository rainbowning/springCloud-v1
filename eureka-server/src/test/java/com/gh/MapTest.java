package com.gh;


import java.util.*;

/**
 * @author GuoHui
 * @Date 2020/4/20
 */
public class MapTest {
    public static void main(String[] args){

//        Map<String,Integer> map=new LinkedHashMap(16,0.75f,true);
//        map.put("测试1",1);
//        map.put("测试2",2);
//        map.put("测试5",5);
//        map.put("测试4",4);
//        map.put("测试3",3);
//        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, Integer> next = iterator.next();
//            System.out.println(next.getKey()+"-----"+next.getValue());
//        }
//        Integer integer = map.get("测试5");
//        Iterator<Map.Entry<String,Integer>> iterator2 = map.entrySet().iterator();
//        while (iterator2.hasNext()){
//            Map.Entry<String, Integer> next = iterator2.next();
//            System.out.println(next.getKey()+"-----"+next.getValue());
//        }

        //实现Comparator接口是对Treemap的key值排序。。。
        Map<Integer,Integer> map=new TreeMap<Integer, Integer>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });




    }

}
