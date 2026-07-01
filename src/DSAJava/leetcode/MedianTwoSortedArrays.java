package DSAJava.leetcode;

import java.util.Arrays;

public class MedianTwoSortedArrays {
    static void main() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double medianNum = MedianTwoSortedArrays.findMedian(nums1,nums2);
        System.out.println(medianNum);
    }

    // The Brute-Force(BF) solution
    public static double findMedian(int[] nums1, int[] nums2){
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,merged,0,nums1.length);
        System.arraycopy(nums2,0,merged,nums1.length,nums2.length);
        int[] sortedMerged = Arrays.stream(merged).sorted().toArray();

        if(sortedMerged.length % 2 == 0){
            int lIndex = sortedMerged.length/2;
            int fIndex = (lIndex - 1);
            return ((double) sortedMerged[lIndex] + sortedMerged[fIndex]) / 2;
        }else{
            int index = sortedMerged.length/2;
            return sortedMerged[index];
        }


    }
}
