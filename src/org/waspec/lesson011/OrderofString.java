package org.waspec.lesson011;

/**
 * Created by Administrator on 2015/2/11.
 * Please refer to the one-note for the explanation
 */
public class OrderofString {
    public static void changeStringOrder(String inputStr){
        char[] convertedString = inputStr.toCharArray();
        int firstIndex=0;
        int lastIndex = convertedString.length - 1;
        changeArrayOrder(convertedString,firstIndex,lastIndex); // total heads up;

        for (int spaceScanner = 0; spaceScanner < convertedString.length; spaceScanner++) {
            if(convertedString[spaceScanner] == ' '){
                lastIndex = spaceScanner-1;
                changeArrayOrder(convertedString,firstIndex,lastIndex); //change the order of a segment, but can not handle the last word
                firstIndex = spaceScanner+1;
            }else if (spaceScanner == convertedString.length-1){        //reach the last word, while firstIndex has already been the last's word;s first index
                lastIndex = spaceScanner;
                changeArrayOrder(convertedString,firstIndex,lastIndex);
            }
        }

        String result = new String(convertedString);
        System.out.println(result);
    }

    public static void changeArrayOrder(char[] theArray, int startIndex, int endIndex){
        int headIndex=startIndex,tailIndex=endIndex;
        char temp;
        while (headIndex<=tailIndex){
            temp = theArray[headIndex];
            theArray[headIndex] = theArray[tailIndex];
            theArray[tailIndex] = temp;
            headIndex++;
            tailIndex--;
        }
    }


}
