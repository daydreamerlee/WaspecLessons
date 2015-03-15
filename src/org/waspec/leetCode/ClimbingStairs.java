package org.waspec.leetCode;

/**
 * Created by Administrator on 2015/2/20.
 */
public class ClimbingStairs {
    public static void testFunc(){
        System.out.println(climbStairsByCycle(5));
    }


    public static int climbStairsByCycle(int stairNumbers){
        int resultOfCurrent=2,resultOfLast=1;
        int temp;
        for (int i = 3; i <=stairNumbers ; i++) {
            temp = resultOfLast;
            resultOfLast=resultOfCurrent;
            resultOfCurrent = resultOfCurrent+temp;
        }
        if(stairNumbers==1){
            return 1;
        }else if (stairNumbers ==2){
            return 2;
        }else return resultOfCurrent;
    }



    public static int getTheWaysRec(int stairNumbers){
        int numbersOfWays;
        if(stairNumbers == 1){
            numbersOfWays = 1;
        }else if(stairNumbers ==2){
            numbersOfWays = 2;
        }else {
            numbersOfWays = getTheWaysRec(stairNumbers - 2) + getTheWaysRec(stairNumbers - 1);
        }

        return numbersOfWays;
    }

}
