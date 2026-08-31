package DSAJava.leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean isContainsDuplicate = checkForDuplicate(nums);
        System.out.println(isContainsDuplicate);
    }

    public static boolean checkForDuplicate(int[] nums){
        HashSet<Integer> uniqueNums = new HashSet<>();

        for(int num:nums){
            if(uniqueNums.contains(num)) {
                return true;
            }
            uniqueNums.add(num);
        }
        return false;
    }
}
/*
Problem Description
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Examples:
    Example 1:
    Input: nums = [1, 2, 3, 1]
    Output: true
    Explanation: The element 1 occurs at indices 0 and 3.

    Example 2:
    Input: nums = [1, 2, 3, 4]
    Output: false
    Explanation: All elements are unique.

    Example 3:
    Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
    Output: true
 */