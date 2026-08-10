package DSAJava.leetcode;

public class MoveZeros {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] arr2 = {2, 0, 1};
        int[] arr3 = {0};
        int[] arr4 = {5};
        int[] arr5 = {1, 2, 3, 4, 5};
        int[] arr6 = {0, 0, 0, 0};
        int[] arr7 = {1, 2, 3, 0, 0};
        int[] arr8 = {0, 0, 7, 8, 9};
        int[] arr9 = {0, 1, 0, 3, 0, 12};
        int[] arr10 = {4, 0, 0, -1, 0, 5};
        moveALlZeros(arr);
        moveALlZeros(arr2);
        moveALlZeros(arr3);
        moveALlZeros(arr4);
        moveALlZeros(arr5);
        moveALlZeros(arr6);
        moveALlZeros(arr7);
        moveALlZeros(arr8);
        moveALlZeros(arr9);
        moveALlZeros(arr10);
    }
    public static void moveALlZeros(int[] arr){
       int slow=0;
       int fast=1;
       while(fast < arr.length){

           if(arr[slow] == 0 && arr[fast] > 0 || arr[fast] < 0){
               int temp = arr[slow];
               arr[slow] = arr[fast];
               arr[fast] = temp;
               slow++;
               fast++;
           }else if(arr[slow] > 0){
               slow++;
           }
           fast++;

       }
       for (int i:arr){
           System.out.print(i + " ");
       }
        System.out.println();
    }
}
//Move all zeroes in an array to the end
//while maintaining the relative order of the non-zero elements.
//Example:
//Input: [0, 1, 0, 3, 12] → Output: [1, 3, 12, 0, 0]
//Input: [2, 0, 1] → Output: [2, 1, 0]