package DSAJava.leetcode;

public class ProductofArrayExceptSelf {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result = productOfArray(nums2);
        for(int num:result) System.out.println(num);
    }

    public static int[] productOfArray(int[] nums){
        int[] prefix = new int[nums.length];
        int leftProduct = 1;
        int rightProduct = 1;

        // calculating prefix sum
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = leftProduct;
            leftProduct *= nums[i];
        }
        // calculating suffix sum
        for (int i = nums.length - 1; i >= 0; i--) {
            prefix[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return prefix;
    }

}
/*
Given an integer array nums, return an array answer such that answer[i] is equal to
the product of all the elements of nums except nums[i].
The problem guarantees that the product of any prefix or suffix of nums will fit into a 32-bit integer.

Core Constraints
    Time Complexity: You must write an algorithm that runs in O(n) time.
    Operation Restriction: You cannot use the division (/) operation.
    Follow-up Challenge: Can you solve it with O(1) extra space complexity?
    (The output array does not count as extra space for space complexity analysis).
    2 <= nums.length <= 10^5
    -30 <= nums[i] <= 30

Examples
    Example 1
    Input: nums = [1, 2, 3, 4]
    Output: [24, 12, 8, 6]
    Explanation:
    For index 0: 2 × 3 × 4 = 24
    For index 1: 1 × 3 × 4 = 12
    For index 2: 1 × 2 × 4 = 8
    For index 3: 1 × 2 × 3 = 6

    Example 2
    Input: nums = [-1, 1, 0, -3, 3]
    Output: [0, 0, 9, 0, 0]
*/
