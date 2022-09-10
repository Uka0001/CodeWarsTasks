package leetcode.programming.skills1;
/*
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
Example 1:
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
Example 2:
Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
Constraints:
3 <= salary.length <= 100
1000 <= salary[i] <= 106
All the integers of salary are unique.
*/

public class Average {
    public static void main(String[] args) {

    }

    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {

            sum += salary[i];
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
        }

        return (sum - min - max) / (salary.length - 2);
    }

    //Another solution from decode
//     class Solution {
//         public double average(int[] salary) {
//             Arrays.sort(salary);
//             double sum = 0;
//             int count = 0;
//             for(int i = 1; i < salary.length - 1; i++) {
//                 sum += salary[i];
//                 count++;
//             }
//             return sum / count;
//         }
//}
    //  Solution #2 from leetcode
//     class Solution {
//         public double average(int[] salary) {
//             Arrays.sort(salary);
//             double sum = 0;
//             int count = 0;
//             for(int i = 1; i < salary.length - 1; i++) {
//                 sum += salary[i];
//                 count++;
//             }
//             return sum / count;
//         }
//     }
}
