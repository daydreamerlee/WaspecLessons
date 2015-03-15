package org.waspec.lesson022;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Administrator on 2015/3/11.
 */
public class ThreadTest {
    public static void main(String[] args){
       say("Tim");
    }

    public static void say(String who){
        for (int i = 0; i < 10; i++) {
            System.out.printf("I'm happy %s,and %d\n", who, i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
