package org.waspec.lesson018;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2015/3/4.
 */
public class ListTest {
    public static void main(String[] args){
        Integer[] oneArray =new Integer[]{1,2,3,4};
        Integer[] secondArray = new Integer[]{4,4,5,5,6,7,8};
        List<Integer> myList = new ArrayList<Integer>(Arrays.asList(oneArray)); // 转化array到list，并调用构造函数
        List<Integer> mysecondList = new ArrayList<Integer>(Arrays.asList(secondArray)); // 转化array到list，并调用构造函数

        Integer[] thirdArray = myList.toArray(new Integer[0]); //再转化回数组


        testAddFunction(myList, mysecondList);
//        testRemoveFunction(myList,mysecondList);
        testGetFunction(myList,mysecondList);
    }

    public static void testAddFunction(List firstList,List secondList){
        firstList.add(19);
        firstList.add(3,30);
        System.out.println(firstList);//在4号位置加加单个元素，5，注意这里的Integer autoboxing语法糖
        firstList.addAll(secondList);
        System.out.println(firstList);//加整个列表
    }

    public static void testRemoveFunction(List firstList,List secondlist){
//        Object removedOne=  firstList.remove(9); //要么就直接用Object声明
//        Integer removedTwo = (Integer) firstList.remove(9);//注意有个type cast，返回来的是Object，不是Integer
//        System.out.println(removedOne);
//        System.out.println(removedTwo);
        firstList.remove((Object)5); // 区分index和 object的方法，就是cast type一下，compiler就知道是object 3了
        System.out.println(firstList);
//        firstList.removeAll(secondlist);
        firstList.retainAll(secondlist);
        System.out.println(firstList);

    }

    public static void testGetFunction(List<Integer> firstList, List<Integer> secondList){//注意list如果用Interger完整了，则局部变量的声明就不必Object cast了

        Integer whatIGet=firstList.get(3);//应该用Integer，但是int也能过
        System.out.println(whatIGet);
        int indexOf= firstList.indexOf((Integer)5);//查找5的第一个index
        System.out.println(indexOf);
    }



}
