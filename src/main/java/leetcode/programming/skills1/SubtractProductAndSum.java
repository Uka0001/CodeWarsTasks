package leetcode.programming.skills1;
/*1281. Subtract the Product and Sum of Digits of an Integer
Easy
1531
197
Add to List
Share
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
Example 1:
Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21
Constraints:
1 <= n <= 10^5
Accepted
286,133
Submissions
330,258
*/

public class SubtractProductAndSum {
    public static void main(String[] args) {
        subtractProductAndSum(234);
    }

    public static int subtractProductAndSum(int n) {
        return prodDigits(n) - sumDigits(n);
    }

    public static int sumDigits(int i) {
        if (i < 10) return i;
        return sumDigits(i / 10) + (i % 10);
    }

    public static int prodDigits(int i) {
        if (i < 10) return i;
        return prodDigits(i / 10) * (i % 10);
    }

    //Solution from Leet Code
    /*public int subtractProductAndSum(int n) {
        int temp = n, a = temp % 10, b = temp % 10;
        temp /= 10;
        while (temp > 0) {
            int res = temp % 10;
            a *= res;
            b += res;
            temp /= 10;
        }
        return a - b;
    }*/
}
