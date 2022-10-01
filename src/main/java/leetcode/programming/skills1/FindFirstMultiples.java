package leetcode.programming.skills1;
/*
* A real method of findMultiples(x, n), which returns the first x x times the actual number n.

Examples:
* findMultiples(3, 4) => [4, 8, 12]
// 4, 8, 12 - перші 3 числа, які кратні числу 4 (діляться на 4 без залишку).

findMultiples(2, 3) => [3, 6]
// 3, 6 - перші 2 числа, кратні числу 3 (діляться на 3 без залишку).
* */
public class FindFirstMultiples {
    public static int[] findMultiples(int x, int n) {
        int [] arr = new int[x];
        int j = 0;
        for (int i = 1; i <= x; i++) {
            arr[j] = n * i;
            j++;

        }
        return arr;
    }
}
