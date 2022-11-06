package leetcode.programming.skills1;

public class Matrix {
    public int[] getMatrix(int[][] matrix) {
        int count = 0;
        int[] resultMatrix = new int[count];
        for (int i = 0; i < matrix.length - 1; i++) {
            count += matrix[i].length - 1;
            resultMatrix = new int[count];
            for (int j = 0; j < matrix[i].length - 1; j++) {
                resultMatrix[i] = matrix[i][j];
            }
        }
        return resultMatrix;
    }

    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        int i = 0, j = 0, k = 0;
        while (k < matrix.length) {
            diagonal[k] = matrix[i][j];
            i += 1;
            j += 1;
            k += 1;
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        int lengthCounter = matrix.length - 1;
        int i = lengthCounter, j = lengthCounter, k = 0;
        while (k < matrix.length) {
            counterDiagonal[k] = matrix[i][j];
            i -= 1;
            j -= 1;
            k += 1;
        }
        return counterDiagonal;
    }
}
