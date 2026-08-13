package DSAJava.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LSubString {
    static void main(String[] args) {
        String s = "abcabcbb";
        String s2 = "pwwkew";
        String s3 = "bbbbb";
        System.out.println("-----Results for Sliding Window and HashSet!------");
        int setR1 = findLongestSubString(s);
        System.out.println(setR1);
        int setR2 = findLongestSubString(s2);
        System.out.println(setR2);
        int setR3 = findLongestSubString(s3);
        System.out.println(setR3);
        System.out.println("-----Results for Sliding Window and HashMap!------");
        int mapR1 = findLongestSubStringOptimal(s);
        System.out.println(mapR1);
        int mapR2 = findLongestSubStringOptimal(s2);
        System.out.println(mapR2);
        int mapR3 = findLongestSubStringOptimal(s3);
        System.out.println(mapR3);
    }
    // The better approach using HashSet().
    public static int findLongestSubString(String s){
        if(s.isEmpty()){
            return 0;
        } else if (s.isBlank()) {
            return 1;
        }
        int left = 0;
        int resultLenght = 0;
        HashSet<Character> sHashSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while(sHashSet.contains(s.charAt(right))){
                sHashSet.remove(s.charAt(left));
                left++;
            }
            sHashSet.add(s.charAt(right));
            resultLenght = Math.max(resultLenght,right - left + 1);

        }
        System.out.println(sHashSet);
        return resultLenght;
    }
    // The optimal approach using HashMap reducing CPU cycles dynamic sized sliding window.
    public static int findLongestSubStringOptimal(String s){
        if(s.isEmpty()){
            return 0;
        } else if (s.isBlank()) {
            return 1;
        }
        int left = 0;
        int resultLenght = 0;
        HashMap<Character,Integer> sHashMap = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if(sHashMap.containsKey(currentChar)){
                left = Math.max(left,sHashMap.get(currentChar) + 1);
            }
            sHashMap.put(currentChar,right);
            resultLenght = Math.max(resultLenght,right - left + 1);

        }
        System.out.println(sHashMap.keySet());
        return resultLenght;
    }
}

//Problem Statement
//The goal is to find the length of the longest contiguous sequence of characters
//that contains no duplicate letters, digits, or symbols.
//Input: A string s consisting of English letters, digits, symbols, and spaces.
//Output: An integer representing the length of the longest substring with unique characters.
//Examples:
// s = "abcabcbb" -> Output: 3 (The longest substring is "abc")
// s = "bbbbb" -> Output: 1 (The longest substring is "b")
// s = "pwwkew" -> Output: 3 (The longest substring is "wke")