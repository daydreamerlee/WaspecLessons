package org.waspec.lesson011;

/**
 * Created by Administrator on 2015/2/11.
 */
public class XOAssignment {
    public static void assignXOMatrix(int n){
        char[][] xoMatrix = new char[n][n];
        for (int row = 0; row <n; row++) {
            for (int cell = 0; cell < n; cell++) {
                xoMatrix[row][cell] = ((row+cell)%2 == 0)?'x':'o';
            }
            String rowResult = new String(xoMatrix[row]);
            System.out.println(rowResult);
        }
    }
}
