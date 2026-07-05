package DSAJava.leetcode;

import java.util.HashMap;

public class LongestSubString {
    static void main() {
        String s = "pwwkew";
        int lengthIs = findLengthenLongestSubString(s);
        System.out.println(lengthIs);
    }

    public static int findLengthenLongestSubString(String s){
        if(s.isEmpty()){
            return 0;
        } else if (s.isBlank()) {
            return 1;
        }
        int left = 0;
        int maxLength = 0;
        HashMap<Character,Integer> positionTracking = new HashMap<>();

        for(int right=0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            if(positionTracking.containsKey(currentChar)){
                left = Math.max(left,positionTracking.get(currentChar) + 1);
            }
            positionTracking.put(currentChar,right);
            maxLength = Math.max(maxLength,right - left + 1);

        }
        return maxLength;
    }


}
