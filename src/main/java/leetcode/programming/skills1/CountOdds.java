package leetcode.programming.skills1;
/*
Given two non-negative integers low and high.
Return the count of odd numbers between low and high (inclusive).
Example 1:
Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
Example 2:
Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].
Constraints:
0 <= low <= high <= 10^9
*/

public class CountOdds {
    public static void main(String[] args) {
        countOdds(3, 7);
    }

    public static int countOdds(int low, int high) {
        int length = high - low + 1;
        int[] values = new int[length];
        int j = 0;
        for (int i = low; i <= high; i++) {

            values[j] = i;
            j++;
        }
        int countOdd = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;

        //Best practice
//        public int countOdds(int low, int high) {
//            int k=(high-low)/2;
//            if(high%2!=0||low%2!=0)k++;
//            return k;
//        }

        //Best pr2
        ////the count of odd numbers between 1 and low - 1 is low / 2
        // the count of odd numbers between 1 and high is (high + 1 ) / 2
        // return (high + 1) / 2 - low / 2;

    }
}
