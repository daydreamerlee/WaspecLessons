package org.waspec.leetCode;

import java.util.Arrays;

/**
 * Created by Administrator on 2015/2/22.
 */
public class RemoveElement {
    public static void testFunc(){
        int[] array = {1};
        int num = 1, newLength;
        newLength= removeElement(array,num);
        System.out.println(newLength);
        System.out.println(Arrays.toString(array));
    }


    public static int removeElement(int[] inputArray, int elem) {
        int temp,numOfInstance=0;
        for (int i = inputArray.length-1; i >=0; i--) {
            if(inputArray[i] == elem){
                temp=inputArray[inputArray.length-1-numOfInstance];
                inputArray[inputArray.length-1-numOfInstance] = inputArray[i];
                inputArray[i]=temp;
                numOfInstance++;
            }
        }
        return inputArray.length-numOfInstance;
    }

}
