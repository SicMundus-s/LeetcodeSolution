package ArraysAndHashing.Easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

public class CanPlaceFlowers {

    public static void main(String[] args) {

        int[] nums = {1,0,0,0,1};
        canPlaceFlowers(nums, 2);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (flowerbed.length >= 3) {

        }
        int count = 0;
        for (int i = 1; i < flowerbed.length - 1; i++) {
            int prev = flowerbed[i - 1];
            int next = flowerbed[i + 1];
            int item = flowerbed[i];

            if(prev == 0 && next == 0 && item == 0) {
                count++;
                flowerbed[i] = 1;
            }
        }

        return count >= n;
    }
}
