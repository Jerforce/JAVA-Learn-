import java.util.Random;

/**
 * @author Jerforce
 * @date 2023/4/1 星期六 16:50:38
 */
public class RandomString {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();
        int length = RandomInteger.RandomIntegerNumber(15);
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; // characters to be used in the random string
        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }
        System.out.println(randomString);
    }
}

