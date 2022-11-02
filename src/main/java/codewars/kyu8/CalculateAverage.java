package codewars.kyu8;

/*
* Write a function which calculates the average of the numbers in a given list.

Note: Empty arrays should return 0.
* */

public class CalculateAverage {
    public static double find_average(int[] array){
        if (array == null || array.length == 0){
            return 0;
        } else {
            float result = 0;
            for (int each: array){
                result += each;
            }
            return result / array.length;
        }
    }
}
