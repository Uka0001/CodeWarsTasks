package codewars.kyu8;
/*
* Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example

For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
* */

public class KataPositives {
    public static int[] countPositivesSumNegatives(int[] input) {

        int [] result = new int[2];
        int lowerZero = 0;
        int higherZero = 0;
        for (int each: input){
            if (each < 0){
                lowerZero += each;
            } else {
                higherZero += 1;
            }
        }
        result[0] = higherZero;
        result[1] = lowerZero;
        return result; //return an array with count of positives and sum of negatives
    }
}
