package org.waspec.lesson009;

/**
 * If test on 2015/2/6.
 */
public class Ifworkout {
    public static void addressCheck(String address) {
        if (address == "Beijing"){
            System.out.println("You are a person in Beijing");
        }else if (address == "Tianjin"){
            System.out.println("You are a person in Tianjin");
        }else if (address == "Shanghai"){
            System.out.println("You R a person in Shanghai");
        }else System.out.println("Your are a person in other cities");
    }
}
