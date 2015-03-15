package org.waspec.lesson013;

/**
 * Created by Administrator on 2015/2/16.
 */
public class HanoTower {

    public static void outputHanoiTowerResult(int platesNum){
        System.out.printf("For %d plates, use %d seconds to complete the process!",platesNum,getMovingTimes(platesNum));
    }


    public static int getMovingTimes(int platesNum){
        if(platesNum ==1){
            return 1;
        }else {
            return 2*getMovingTimes(platesNum - 1)+1;
        }
    }

}
