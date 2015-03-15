package org.waspec.lesson019;

/**
 * Created by Administrator on 2015/3/6.
 */
public class ListedArrayToTree {
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode outputArranged = constructTree(testArray);
        TreeTraversal.preOrderDFT(outputArranged);

    }

    public static TreeNode constructTree(int[] inputArray) {
        TreeNode output;
        if (inputArray.length == 0){return null;}
        else if (inputArray.length == 1) {
            output = new TreeNode(inputArray[0]);
            return output;
        } else if (inputArray.length == 2) {
            output = new TreeNode(inputArray[1]);
            output.leftChild = new TreeNode(inputArray[0]);
            return output;
        } else {
            int mid = inputArray.length / 2; // root of curent
            output = new TreeNode(inputArray[mid]);
            output.leftChild = constructTree(cutTheArray(inputArray, 0, mid - 1));
            output.rightChild = constructTree(cutTheArray(inputArray, mid + 1, inputArray.length - 1));
        }
        return output;
    }

    public static int[] cutTheArray(int[] inputArray, int startIndex, int endIndex) {
        int[] resultArray = new int[endIndex - startIndex + 1];
        for (int i = 0; i < endIndex - startIndex + 1; i++) {
            resultArray[i] = inputArray[startIndex + i];
        }
        return resultArray;
    }

}
