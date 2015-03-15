package org.waspec.lesson010;

/**
 * Created by Administrator on 2015/2/8.
 */
public class JiujiuBiao {
    public static void printJiujiuBiao(){
        printBiao();
    }

    public static void printBiao(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%dx%d=%d\t",i+1,j+1,(i+1)*(j+1));
//                System.out.printf("%dx%d=%-3d",i+1,j+1,(i+1)*(j+1));
            }
            System.out.println();
        }
    }
}
