package ArraysAndHashing.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = {3,2,2,3};
        removeElement2(nums, 3);
    }

    public static int removeElement(int[] nums, int val) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 51;
                count++;
            }
        }
        Arrays.sort(nums);
        return nums.length - count;
    }
    public static int removeElement2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}

