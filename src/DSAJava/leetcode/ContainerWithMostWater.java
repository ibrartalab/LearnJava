package DSAJava.leetcode;

public class ContainerWithMostWater {
    static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = containerHasMostWater(height);
        System.out.println(result);
    }

    public static int containerHasMostWater(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int max_capacity_container = 0;

        while (left < right){
            int area = Math.min(arr[left],arr[right]) * (right - left);
            if(area > max_capacity_container){
                max_capacity_container = area;
            }
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_capacity_container;
    }
}

/*
Problem Description
You are given an integer array height of length n.
There are n vertical lines drawn such that the two endpoints of the i-th line are (i, 0)
and (i, height[i]).Find two lines that together with the x-axis form a container,
such that the container contains the most water.

Note: You may not slant the container,
and the width between the two lines is the difference between their indices.

Mathematical FormulaThe amount of water a container can hold is limited by the
shorter line and the distance between the two lines:
Area=min(height[left],height[right])*(right-left)

ExamplesExample 1:
Input: height = [1,8,6,2,5,4,8,3,7]Output: 49
Explanation: The vertical lines are represented by the array. In this case,
the max area of water the blue section can contain is obtained by choosing the
second line (height[1] = 8) and the last line (height[8] = 7).
The distance between them is 8 - 1 = 7, and the height is (min(8, 7) = 7).
Thus, Area = 7 × 7 = 49.

Example 2:Input: height = [1,1] Output: 1
*/

