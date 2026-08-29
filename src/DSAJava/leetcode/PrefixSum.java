package DSAJava.leetcode;

public class PrefixSum {
    static void main(String[] args) {
        // Give me the cumulative sum for each day of earning
        // Day0:3 Day2:4 Day:-2(take 2 of debt) and so on...
        int[] dailyEarning = {3,4,-2,5,8};
        int totalEarnings = cumulativeSumWithoutPrefixSum(dailyEarning);
        System.out.println(totalEarnings);

        /*
         Now you get the total earnings, but suddenly you think that
         how much money have i earned from day1 to day 3.
         So cant answers this type of question from the above one,
         cause it does not have any precomputed information so that you
         can simply pass the dates and get the result.
         So to answer these type of questions we need to learn and implement
         prefixSum algorithm.
        */
        int[] pArray = cumulativeSumUsingPrefixSum(dailyEarning);
        // To get the total sum only from this preprocessed array(pArray)
        // Just access the last day of earning by its day index.
        // Because it is the total earnings for all previous days up to this.
        for (int i:pArray) System.out.println(i); // verify this
        int totalPrefix = pArray[pArray.length - 1];
        System.out.println("Total Earnings Using PrefixSum: " + totalPrefix);
        // But we can also answer to this question as well very easily:
        // Find the total sum from day 1 to day 3
        int fromDay1ToDay3 = pArray[3] - pArray[1 - 1];
        System.out.println("Total Earnings from day1 to day3 are:\n" + fromDay1ToDay3);

    }

    /**
     * This is the naive approach to sum of all the earnings in the list of days given.
     * @param earnings  This is an array of earnings for each day.
     *                 The method will take it is an argument
     * @return This method will return an int value contains the sum of earnings.
     */
    public static int cumulativeSumWithoutPrefixSum(int[] earnings){
        int sum = 0;
        for (int earning:earnings){
            sum += earning;
        }
        return sum;
    }

    /**
     * This method is more optimize way of calculating cumulative sum, and also
     * to answer questions such is like total sum from day 1 to day 4 or calculating
     * running total etc.
     * @param earnings This method take an array as an argument to process and
     *                 do the calculation.
     * @return This method is returning an preprocessed array to answer further
     * questions.
     */
    public static int[] cumulativeSumUsingPrefixSum(int[] earnings){
        int[] prefix = new int[earnings.length];
        prefix[0] = earnings[0];
        for (int i = 1; i < earnings.length; i++) {
            prefix[i] = prefix[i - 1] + earnings[i];
        }
        return prefix;
    }
}
