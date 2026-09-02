package DSAJava.leetcode;

import java.util.HashMap;

public class LongestCommonPrefix {
    static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = findCommonPrefix(strs);
        System.out.println(result);
    }

    public static String findCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0) return "";

        String referenceWord = strs[0];
        for (int i = 0; i < referenceWord.length(); i++) {
            char currentChar = referenceWord.charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != currentChar){
                    return referenceWord.substring(0,i);
                }
            }
        }
        return referenceWord;
    }
}
/*
The Longest Common Prefix problem requires you to write a function
that finds the longest shared starting substring among an array of strings.
If the strings do not share any common starting characters, the function must
return an empty string ""

Examples
    Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Explanation: The characters "f" and "l" are the only ones that appear at the
    very beginning of all three strings

    Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings because they
    start with different letters (d, r, and c)
 */
