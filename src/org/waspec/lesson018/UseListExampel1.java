package org.waspec.lesson018;

import java.util.*;

/**
 * Created by Administrator on 2015/3/2.
 */
public class UseListExampel1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        System.out.println(myList.size());
        myList.add(1000);
        System.out.println(myList.size());
        Integer integer = myList.get(0);
        System.out.println(integer);
        myList.add(2000);
        myList.add(1, new Integer(3000));

        Integer removed = myList.remove(1);

        for (Integer i : myList) {
            System.out.println(i);//这个就是iterator 的语法糖，用的就是iterator
        }
        System.out.println(removed);
    }
}



