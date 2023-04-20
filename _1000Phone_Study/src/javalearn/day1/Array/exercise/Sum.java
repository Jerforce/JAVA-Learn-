package javalearn.day1.Array.exercise;

/**
 * @author Lenovo
 * @create 2023/3/23 19:30
 **/
public class Sum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length - i - 1];
        }
        if (mat.length % 2 == 1) {
            sum -= mat[mat.length / 2][mat.length / 2];
            //矩阵有两条对角线，还需要减去中间值因为被计算了两次
        }
        return sum;
    }

}
