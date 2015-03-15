package org.waspec.lesson010;

/**
 * Created by Administrator on 2015/2/8.
 */
public class WorkonArray {
    public static void workonArray(){
        int[] myArray={1,3,4,7,9};
        changeArrayOrder(myArray);
        for (int i = 0; i <= myArray.length-1; i++) {
            System.out.println(myArray[i]);
        }

    }
    
    public static void changeArrayOrder(int[] array){
        int temp;
        for (int i = 0; i <= array.length/2-1; i++) {
            temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    } 
}
