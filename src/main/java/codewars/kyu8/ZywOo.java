package codewars.kyu8;

import java.util.Arrays;
import java.util.Collections;

public class ZywOo {
    public static int sumOfDifferences(int[] arr) {
        int count = 0;
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return 0;
        } else {
            Arrays.sort(arr);
            for (int i = arr.length-1; i > 0; i--) {
                count += arr[i] - arr[i - 1];
            }
            return count;
        }
    }
}

//BP CodeWars
//public static int sumOfDifferences(int[] arr) {
//    Arrays.sort(arr);
//    return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
//  }

