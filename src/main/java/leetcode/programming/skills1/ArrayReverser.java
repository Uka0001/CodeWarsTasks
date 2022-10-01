package leetcode.programming.skills1;

/*
 * There are lines, their disorders, and
 *  order changes so that their length
 *  remains the same as the length of the starting lines.*/
public class ArrayReverser {
    public static String[] reverse(String[] a) {
        int[] b = new int[a.length];
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i].length();
            strBuilder.append(a[i]);
        }
        String[] result = new String[a.length];
        char[] charArr = strBuilder.reverse().toString().toCharArray();
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            StringBuilder strTemp = new StringBuilder();
            for (int j = x; j < x + b[i]; j++) {
                strTemp.append(charArr[j]);
            }
            result[i] = strTemp.toString();

            strTemp.delete(0, b[i]);
            x = x + b[i];
        }
        return result;
    }
}
