package Question2;

import java.util.Arrays;

public class FindSumOfBorders {
    public static int[] sumOfBorders(int[][] matrix){
        int m = matrix.length / 2 + (matrix.length % 2 == 0 ? 0 : 1);
        int n = matrix[0].length / 2 + (matrix[0].length % 2 == 0 ? 0 : 1);
        int[] res = new int[Math.min(m, n)];

        for (int i = 0; i < Math.min(m, n); i++) {
             int temp = countBorder(matrix, i);
             res[i] = temp;
        }

        return res;
    }

    private static int countBorder(int[][] matrix, int i) {
        int res = 0;

        // count upper row
        for (int j = i; j < matrix[0].length - i; j++) {
            res += matrix[i][j];
            res += matrix[matrix.length - i - 1][j];
        }
        // count left column
        for (int j = i; j < matrix.length - i; j++) {
            res += matrix[j][i];
            res += matrix[j][matrix[0].length - i - 1];
        }

        res -= matrix[i][i] + matrix[matrix.length - i - 1][i]
                + matrix[matrix.length - i - 1][matrix[0].length - i - 1] + matrix[i][matrix[0].length - i - 1];

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{9, 7, 4, 5}, {1, 6, 2, -6}, {12, 20, 2, 0}, {-5, -6, 7, -2}};
        System.out.println(Arrays.toString(sumOfBorders(matrix1)));

        int[][] matrix2 = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30}};
        System.out.println(Arrays.toString(sumOfBorders(matrix2)));
    }
}
