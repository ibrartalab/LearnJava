package DSAJava.leetcode;

import java.util.HashMap;

public class TwoSum {
    static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] resultIndexes = findTwoSum(nums,target);
        for (int index:resultIndexes){
            System.out.print(index + " ");
        }
        System.out.println();
        int[] resultIndexes2 = twoSumOptimal(nums,target);
        for (int index:resultIndexes2){
            System.out.print(index + " ");
        }

    }

    // The Brute-Force(BF) solution
    public static int[] findTwoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    // The optimal (better efficiency) solution
    public static int[] twoSumOptimal(int[] nums,int target){
        int i = 0;
        int n = nums.length-1;
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        while (i <= n){
            int complement = target - nums[i];
            if(numsMap.containsKey(complement)){
                return new int[] {numsMap.get(complement),i};
            }else{
                numsMap.put(nums[i],i);
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}
