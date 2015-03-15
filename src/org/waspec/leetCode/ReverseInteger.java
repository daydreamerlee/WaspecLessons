package org.waspec.leetCode;

/**
 * Created by Administrator on 2015/2/23.
 */
public class ReverseInteger {
    public static void testFunction(int x){
        int result;
        result= reverse(x);
        System.out.println(result);
    }


    public static int reverse (int x){
        int signal;
        int leftOver,result;
        ListNode digit = new ListNode(0);
        ListNode currentNode = digit;

        if(x==0){
            return x;
        }else {
            signal = Math.abs(x)/x;
            leftOver=Math.abs(x);
        }

        while(leftOver>0){
            currentNode.next= new ListNode(leftOver%10);
            currentNode = currentNode.next;
            leftOver=leftOver/10;
        }

        currentNode=digit.next;
        result=0;
        while(currentNode!=null){
            if (result> Integer.MAX_VALUE/10){return 0;}
            else {
                result = result * 10 + currentNode.val;
                currentNode = currentNode.next;
            }
        }

        return result*signal;
    }

}
