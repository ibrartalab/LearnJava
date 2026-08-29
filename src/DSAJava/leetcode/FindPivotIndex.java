package DSAJava.leetcode;

public class FindPivotIndex {
    static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int pivotIndex = findPivotIndexOfArray(nums);
        System.out.println(pivotIndex);
    }

    public static int findPivotIndexOfArray(int[] nums){
        int totalSum = 0;
        int leftSum = 0;
        for(int num:nums) totalSum += num;

        for (int i=0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
