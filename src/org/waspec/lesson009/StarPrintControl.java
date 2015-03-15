package org.waspec.lesson009;

/**
 * Created by Administrator on 2015/2/6.
 */
public class StarPrintControl {
    public static void starPrint(int outerControl){
        int innerLayerControl=1;
        while (innerLayerControl <= outerControl){
            System.out.print("*");
            innerLayerControl++;
        }
    }
}
