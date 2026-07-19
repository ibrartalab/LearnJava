package DSAJava.bigOnotation;

public class LearnBigONotation {
    /*
     Big O notation describe/measure resource usage of (time or space) grows as the input size (n) grow.
     Big O used to analyze how much an algorithm is efficient or to compare two algorithms.

     Time: counts how many operations the CPU executes as the input n grows.
     Space: counts how much extra memory slots the RAM allocates as inout n grows.

     Why the analysis of algorithms matters/important?
     Suppose we have an array given of size n, and required to find a target value t.
     Now look into two different algorithms how each of them perform different.
     int[] nums = new {1,12,22,32,45,56,78,98};
     n = 8
     Algorithm 1:
        It will start from value at index 0 and continuously comparing with target element.
        So, in this algorithm is directly proportional to the input size n.
        What we mean by this. imagine n=8 in the worst case either the target element exist in the last position
        or might not exist in the array. we need to linearly search the entire array.
        So, we can say if the input n grows the number of operations will grow.
        n=8 operation = 8

        target = 98
        1=98 no
        12=98 no
        22=98 no
        32=98 no
        45=98 no
        56=98 no
        78=98 no
        98=98 yes total comparison 8
     Algorithm 2:
        Now we know that the given array nums is in a natural order, means sorted in ascending order.
        we want to divide the array by 2 each time, which half the input size at every iteration.
        we divide the array by 2 and check if the current mid-value is equal to the target or less than.
        If it is not equal to the current and not less than, then we drop the first half of the array and
        again divide the remaining part by 2 until we reached to 1 element left or find the target.
        mid= the middle value
        target=98
        arr/2 = 32=98 no, 32 < 98 yes, Now drop the first part
        /2 = 56=98 no, 56 < 98 yes, drop this part
        /2 = 78=98 no, 78 < 98 yes, drop
        Now in this point we just left only one element if this is equal or not.
        98=98 yes total comparison 4

     If each operation takes 1ms and the n=100 algorithm-1 will take 100ms and algorithm-2 7ms.
     If n=1b algorithm-1 will take 11 days to process this and algorithm-2 will only take 29ms.
     1 billion / 2= 500 million
     500 million / 2=250 million
     250 million/2=125 million
     125/2=62500000
     62500000/2=31250000
     31250000/2=15625000
     15625000/2=7812500
     7812500/2=3906250
     3906250/2=1953125
     1953125/2=976562.5
     976562.5/2=488281.25
     488281.25/2=244140.625
     244140.625/2=122070.3125
     122070.3125/2=61035.15625
     61035.15625/2=30517.578125
     30517.578125/2=15258.7890625
     15258.7890625/2=7629.39453125
     7629.39453125/2=3814.69726563
     3814.69726563/2=1907.34863281
     1907.34863281/2=953.674316405
     953.674316405/2=476.837158203
     476.837158203/2=238.418579102
     238.418579102/2=119.209289551
     119.209289551/2=59.6046447755
     59.6046447755/2=29.8023223877
     29.8023223877/2=14.9011611938
     14.9011611938/2=7.4505805969
     7.4505805969/2=3.72529029845
     3.72529029845/2=1.86264514923

     So we learn that how a good algorithm performance a million times faster when the input size n grows.
     Algorithm 1 is called Linear search which the time complexity of O(n)
     Algorithm 2 is called Binary Search, binary means (two) so we used this algorithm
     to divide the input by 2 each time to make it half. time complexity O(log n).

     Common Complexities:
        O(1) constant time: the amount of work/operation will stay the  same regardless of the n.
        O(log n) logarithmic time: barely change proportional to n.
        O(n) linear time: the operation will grow as the input grows n.
        O(n log n) linearithmic: The standard speed for efficient sorting. (e.g., Merge Sort).
        O(n^2) quadratic time: : The time grows exponentially by power of 2. (e.g., Nested loops / Bubble Sort).
        O(2^n) exponential and O(n!) factorial.

     Good complexities are O(1),O(log n),O(n), and O(n log n).
     Bad complexities are O(n^2),O(n^3),O(2^n), and O(n!).
     */

    static void main() {
        //let's do dome example
        int[] nums = {1,2,3,4,5,6,7,8};
        algo1(nums);

    }

    public static void algo1(int[] arr){
        // print current and next element
        for (int i=0; i < arr.length; i++){ //(n)
            for(int j=0; j < arr.length; j++){ //(n)
                System.out.println(i + "," + j); // constant k
            }
        }
        // n+n = n^2 -> O(n^2)

        // print elements in arr
        for(int element: arr){ // (n)
            System.out.println(element); // constant k
        }

        // (n^2) + (n) = keep dominant O(n^2)
    }
}
