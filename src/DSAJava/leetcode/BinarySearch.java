package DSAJava.leetcode;

public class BinarySearch {
    static void main(String[] args) {
        int target = 9;
        int[] nums = {-1,0,3,5,9,12};
        int result = binarySearch(nums,target);
        System.out.println(result);

        int target2 = 14;
        int[] nums2 = {2,3,5,6,7,11,12,14,18};
        int recResult = recursiveBinarySearch(nums2,target2,0,nums2.length-1);
        System.out.println(recResult);
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

    public static int recursiveBinarySearch(int[] nums,int target,int low,int high){
        if(low > high) return -1;
        int mid = low + (high - low)/2;
        if(nums[mid] == target){
            return mid;
        } else if (nums[mid] < target) {
            return recursiveBinarySearch(nums,target,mid+1,high);
        } else if (nums[mid] > target) {
            return recursiveBinarySearch(nums,target,low,mid-1);
        }
        return recursiveBinarySearch(nums,target,low,high);
    }
}
