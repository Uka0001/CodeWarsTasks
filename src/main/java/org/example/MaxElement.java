package org.example;

public class MaxElement {
    public static void main(String[] args) {
        int[][] matrix1 = {{-2, 31, 6, 7}, {15, -42, 1, 0}, {9, -7, 12, 19}, {55, 34, 1, -10}};
        System.out.println(getMaxElement(matrix1));
    }

    static int getMaxElement(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        if (matrix[i].length == 1 && matrix[j].length == 1) {
            max = matrix[i][j];
        } else {
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix[i].length; j++) {
                    if (max < matrix[i][j]) {
                        max = matrix[i][j];
                    }
                }
            }
        }
        return max;
    }
}
