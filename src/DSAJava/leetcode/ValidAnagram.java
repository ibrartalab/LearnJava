package DSAJava.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class ValidAnagram {
    static void main(String[] args) {
        String source = "anagram";
        String target = "nagaram";
        boolean isValidAnagram = checkValidAnagram(source,target);
        System.out.println(isValidAnagram);
    }

    // Using Sorting technique
    public static boolean checkValidAnagram(String source, String target){
        char[] s = source.toCharArray();
        char[] t = target.toCharArray();

        Arrays.sort(s);
        Arrays.sort(t);
        String newS = new String(s);
        String newT = new String(t);

        return newS.equals(newT);
    }
}

/*
Problem Statement
Input: Two strings, s and t.
Output: Return true if t is an anagram of s, and false otherwise

What is an Anagram?
An anagram is a word or phrase made by rearranging the letters of another word.
Both strings must use the exact same characters with the same frequency (count).
Order does not matter.

Examples
    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true

    Example 2:
    Input: s = "rat", t = "car"
    Output: false

    Example 3:
    Input: s = "rat", t = "atr" | "tar" | "tra" | "art"
    Output: true
 */