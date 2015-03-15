package org.waspec.lesson009;

/**
 * Created by Administrator on 2015/2/6.
 */
public class GenderCheck {
    public static void ckeck(String gender, int age){
        if (gender == "man" && age > 18) {
            System.out.println("This is an adult man");
        } else if (gender == "women" && age > 18) {
            System.out.println("This is an adult women");
        } else if (gender == "man" && age <= 18) {
            System.out.println("THis is a boy");
        } else if (gender == "women" && age <= 18) {
            System.out.println("This is a girl");
        } else System.out.println("Error!");
    }
}
