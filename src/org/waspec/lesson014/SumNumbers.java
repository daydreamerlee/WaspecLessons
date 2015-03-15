package org.waspec.lesson014;

/**
 * Created by Administrator on 2015/2/16.
 */
public class SumNumbers {
    public static void sumTheNumber1(int n){
        int result;
        result= (1+n)*n/2;
        System.out.printf("The result summing from 1 to %d is %d.\n", n, result);
    }

    public static void sumTheNumberbyCycle(int n){
        int result=0;
        for (int i = 1; i <= n; i++) {
            result +=i;
        }
        System.out.printf("The result summing from 1 to %d is %d.\n", n, result);
    }


    public static void sumTheNumberbyRecursion(int n){
        System.out.printf("The result summing from 1 to %d is %d.\n", n, resultSum(n));
    }

    public static int resultSum(int n){
        if(n==1){
            return n;
        }else {
            return resultSum(n-1)+n;
        }
    }
}
