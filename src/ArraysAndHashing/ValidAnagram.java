package ArraysAndHashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "tac"));
    }
    public static boolean isAnagram(String s, String t) {
        char[] tempOne = s.toCharArray();
        char[] tempTwo = t.toCharArray();

        Arrays.sort(tempOne);
        Arrays.sort(tempTwo);
        return Arrays.equals(tempOne, tempTwo);
    }
}
