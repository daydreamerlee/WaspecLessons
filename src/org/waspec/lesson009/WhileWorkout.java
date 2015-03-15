package org.waspec.lesson009;

/**
 * Created by Administrator on 2015/2/6.
 */
public class WhileWorkout {
    public static void printStar(int n){
        int outerControl,innerControl;
        outerControl=1;
        while (outerControl<=n){
            innerControl=0;
            while (innerControl<outerControl){
                System.out.print("*");
                innerControl++;
            }
            System.out.println();
            outerControl++;
        }
    }
}
