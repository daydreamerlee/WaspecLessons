package org.waspec.lesson010;

/**
 * by Cheng Li for square, triangle * printing
 * Created by Administrator on 2015/2/7.
 */
public class StarPrinter {
    public static void printStars(int choice,int n) {
        if (choice==1){
            MatrixStarPrinter.printStarMatrix(n);
        }else if (choice ==2){
            TriangleStarPrinter.printStarTriangle(n);
        }else if (choice ==3){
            TriangleStarPrinter.printStarIsosceleTriangle(n);
        }else if (choice ==4){
            RhombusStar.printRhombusStar(n);

        }


    }

}

class MatrixStarPrinter{
    public static void printStarMatrix(int n){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class TriangleStarPrinter{
    public static void printStarTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printStarIsosceleTriangle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                if(j<=n-i){
                    System.out.print(" ");
                }else if(j<=n+i-1){
                    System.out.print("*");
                }
            }
            System.out.println();
            }
    }
}

class RhombusStar {
    public static void printRhombusStar(int n){
        for (int i = 1; i <=2*n-1; i++) {
            for (int j = 1; j <=2*n-1; j++) {
                if (i<=n){
                    if(j<=n-i){
                        System.out.print(" ");
                    }else if(j<=n+i-1){
                        System.out.print("*");
                    }
                }else {
                    if(j<=i-n){
                    System.out.print(" ");
                }
                    else if(j<=3*n-i-1){
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

}