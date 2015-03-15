package org.waspec.leetCode;

/**
 * Created by Administrator on 2015/2/20.
 */
public class RomaNumber {
    public static int translateRomeToArabic (String romeNumber){
        int result,index;
        char[] charArray = romeNumber.toCharArray();
            index = charArray.length-1;
            result = singleRomeToArabic(charArray[index]);
            while (index>=1){
                index--;
                if(singleRomeToArabic(charArray[index]) >= singleRomeToArabic(charArray[index+1])){
                    result += singleRomeToArabic(charArray[index]);
                }else if (singleRomeToArabic(charArray[index]) < singleRomeToArabic(charArray[index+1])){
                    result -= singleRomeToArabic(charArray[index]);
                }
            }

        return result;
    }

   public static int singleRomeToArabic (char singleRomeNumber){
        int output=1;
        switch (singleRomeNumber){
            case 'I':
                output = 1;
                break;
            case 'V':
                output = 5;
                break;
            case 'X':
                output = 10;
                break;
            case 'L':
                output = 50;
                break;
            case 'C':
                output = 100;
                break;
            case 'D':
                output = 500;
                break;
            case 'M':
                output = 1000;
                break;
            default:
                System.out.println("Wrong Input!");
                break;
        }
        return output;
    }
}

