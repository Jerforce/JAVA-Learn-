package Test_AI.day0331;

/**
 * @author Lenovo
 * @create 2023/3/30 20:56
 **/
public class TestTrangle {
    public static void main(String[] args) {
        // 打印杨辉三角
        int [][] arr = new int[20][]; // 创建一个10行未知列的二维数组
        for(int i = 0; i < arr.length; i++) { // 循环行
            arr[i] = new int[i+1]; // 为每一行创建对应数量的列（第几行就有几列）
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i) { // 首列和尾列赋值0
                    arr[i][j] = 1;
                }else { // 其他列值为上面一行当前列和前一列的和
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
