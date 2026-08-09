package DSAJava.leetcode;

public class BinarySearch {
    static void main(String[] args) {
        int target = 9;
        int[] nums = {-1,0,3,5,9,12};
        int result = binarySearch(nums,target);
        System.out.println(result);
    }

    public static int binarySearch(int[] nums,int target){
        int low = 0;
        int high = nums.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid -1;
            }
        }
        return -1;
    }
}
