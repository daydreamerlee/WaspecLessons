package org.waspec.lesson009;

/**
 * Created by Administrator on 2015/2/6.
 */
public class StarWorkout {
    public static void pintStar (int n){
        int outControl=1;
        while (outControl<=n){
            BlankPrintControl.blankprint(n - outControl);
            StarPrintControl.starPrint(2*outControl-1);
            System.out.println();
            outControl++;
        }
        outControl--;
        while (outControl>0){
            BlankPrintControl.blankprint(n - outControl);
            StarPrintControl.starPrint(2*outControl-1);
            System.out.println();
            outControl--;

        }
    }
}
