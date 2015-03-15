package org.waspec.lesson009;

/**
 * Created by Administrator on 2015/2/6.
 */
public class WhileWorkout2 {
    public static void printStar2(int n){
        int innerBlankControl,innerStarControl,outerLayerControl=1;
        while (outerLayerControl<=n){
            innerBlankControl=0;
            innerStarControl=0;
            while(innerBlankControl<n-outerLayerControl){
                System.out.print(" ");
                innerBlankControl++;
            }

            while(innerStarControl<(2*outerLayerControl-1)){
                System.out.print("*");
                innerStarControl++;
            }
            System.out.println();
            outerLayerControl++;
        }
    }
}
