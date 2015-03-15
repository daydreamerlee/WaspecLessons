package org.waspec.lesson009;

/**
 * Created by Administrator on 2015/2/6.
 */
public class BlankPrintControl {
    public static void blankprint(int outLayerControl){
        int innerLayerControl=1;

        while(innerLayerControl<=outLayerControl){
            System.out.print(" ");
            innerLayerControl++;
        }
    }
}
