package ArraysAndHashing;

import java.util.Arrays;

/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right,
 * and replace the last element with -1.
 */
public class ReplaceElementWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    // 6 7 8 4 2
    public static int[] replaceElements(int[] arr) {
        var max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if(temp > max) {
                max = temp;
            }
        }
        return arr;
    }
}
