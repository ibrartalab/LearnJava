package DSAJava.leetcode;

public class MergeSortedArrays {
    static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        int[] result = mergeSortedArrays(nums1,nums2,m,n);
        for (int i:result){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] nums3 = {0};
        int[] nums4 = {1};
        int m1 = 0;
        int n1 = 1;
        int[] result1 = mergeSortedArrays(nums3,nums4,m1,n1);
        for (int i:result1){
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static int[] mergeSortedArrays(int[] nums1,int[] nums2,int m,int n){
        int p1 = m-1;
        int p2 = n - 1;
        int p3 = (m+n)-1;

        if(m==0) return nums2;
        if (n==0) return nums1;
        while (m >= 0){
            if(nums2[p2] > nums1[p1]){
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }else if(nums2[p2] < nums1[p1]){
                int temp = nums1[p1];
                nums1[p1] = nums2[p2];
                nums1[p3] = temp;
            }
            m--;
        }
        return nums1;
    }
}

//Problem Description
//You are given two integer arrays, nums1 and nums2,
//sorted in non-decreasing order,
//and two integers, m and n, representing the number of valid elements in nums1
//and nums2 respectively.
//To accommodate the merged result, nums1 has a total length of m + n.
//The first m elements contain the actual numbers that need to be merged,while
//the final n elements are initialized to 0 and serve as empty placeholder slots

//Examples:
//Example 1:Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: We are merging [1,2,3] and [2,5,6] directly into nums1

//Example 2:Input: nums1 = [1], m = 1, nums2 = [], n = 0 Output: [1]

//Example 3:Input: nums1 = [0], m = 0, nums2 = [1], n = 1 Output: [1]
