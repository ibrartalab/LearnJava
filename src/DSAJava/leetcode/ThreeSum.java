package DSAJava.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {0,0,0};
        List<int[]> result = threeSum(nums);
        for(int[] r:result){
            System.out.println(Arrays.toString(r));
        }
    }
    public static List<int[]> threeSum(int[] arr){
        int p1 = 0;
        int p2 = 1;
        int p3 = 2;
        List<int[]> triplet = new ArrayList<>();
        while(p2 < arr.length && p3 < arr.length){
            int sum = arr[p1] + arr[p2] + arr[p3];
            if(p1 != p2 && p1 != p3 && p2 != p3){
                if(sum == 0){
                    triplet.add(new int[]{arr[p1],arr[p2],arr[p3]});
                }
                p2++;
                p3++;
            }
        }
        return triplet;
    }
}

/*
Problem DescriptionGiven an integer array nums,
return all the triplets [nums[i], nums[j], nums[k]]
such that:i != j, i != k, and j != k (The indices must be distinct).
nums[i] + nums[j] + nums[k] == 0 (The values must sum to zero).

Notice: The solution set must not contain duplicate triplets.
Even if numbers repeat in the input array, you cannot include the exact same combination of numbers
 (e.g., [-1, 0, 1]) more than once in your final answer.

Examples
 Example 1:Input: nums = [-1, 0, 1, 2, -1, -4]
 Output: [[-1, -1, 2], [-1, 0, 1]]
 Explanation:
 nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 The distinct triplets that sum to 0 are [-1, 0, 1] and [-1, -1, 2].
 Note: The order of the output and the order of the triplets does not matter.

 Example 2:Input: nums = [0, 1, 1]
 Output: []Explanation: The only possible triplet sums to 0 + 1 + 1 = 2, which is not 0.

 Example 3:Input: nums = [0, 0, 0]
 Output: [[0, 0, 0]]
 Explanation: The only possible triplet sums to 0.
*/
