import java.util.UUID;

/**
 * @author Jerforce
 * @date 2023/4/1 星期六 17:06:36
 */
public class RandomUUID {
    public static String randomStringUUID(String uuid) {
        uuid = UUID.randomUUID().toString();
        return uuid;
    }

    public static void main(String[] args) {
        System.out.println(randomStringUUID(null));
    }
}
