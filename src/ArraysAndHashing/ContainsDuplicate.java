package ArraysAndHashing;

import java.util.*;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            if (integerSet.contains(num)) {
                return true;
            }
            integerSet.add(num);
        }
        return false;

    }
}
