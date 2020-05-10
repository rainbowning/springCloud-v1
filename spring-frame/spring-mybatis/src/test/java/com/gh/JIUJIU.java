package com.gh;

/**
 * @author GuoHui
 * @Date 2020/5/7
 */
public class JIUJIU {

    public static void main(String[] args){

        for(int m=1;m<10;m++){
            for(int n=1;n<m+1;n++){
                System.out.print(n+"X"+m+"="+m*n+"\t");
            }
            System.out.println();
        }
//

        System.out.println("乘法口诀表：");
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }

}
