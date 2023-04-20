/**
 * @author Jerforce
 * @date 2023/4/1 星期六 16:50:04
 */
public class RandomInteger {
    public static int RandomIntegerNumber(int value) {
         value  = (int) (Math.random() * value);
        return value;

    }
        public static void main(String[] args) {
            System.out.println(RandomIntegerNumber(100));;

    }
}
