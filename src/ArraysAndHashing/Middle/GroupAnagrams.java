package ArraysAndHashing.Middle;


import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] str) {
        int n=str.length;
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        List<List<String>> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            char [] ch=str[i].toCharArray();
            Arrays.sort(ch);
            String temp=new String(ch);
            if(hm.containsKey(temp)){
                hm.get(temp).add(str[i]);
            }
            else{
                ArrayList<String> t=new ArrayList<>();
                t.add(str[i]);
                hm.put(temp,t);
            }
        }

        for(String key:hm.keySet()){
            list.add(hm.get(key));
        }

        return list;
    }
}
