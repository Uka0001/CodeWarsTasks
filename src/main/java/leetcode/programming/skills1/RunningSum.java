package leetcode.programming.skills1;

public class RunningSum {
    public static void main(String[] args) {
        RunningSum runningSum = new RunningSum();
        runningSum.runningSum(new int[]{3, 1, 2, 10, 1});
    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] += nums[i];
            } else {
                result[i] = result[i - 1] + nums[i];
            }
        }
        return result;
    }
    //Solution from LeetCode1
    /*public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            nums[i] += nums[i - 1];
        }
        return nums;
    }*/
}
