package Test_AI.day0331;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jerforce
 * @date 2023/4/6 星期四 19:37:20
 */
public class Demo0637 {
    public static void main(String[] args) {


        // Defining the email regex pattern
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        // Compiling the regex pattern
        Pattern pattern = Pattern.compile(emailRegex);
        System.out.println("输入邮箱，回车停止：");
        // Defining the email to be checked
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        // Matching the email with the regex pattern
        Matcher matcher = pattern.matcher(email);

// Checking if the email matches the regex pattern
        if (matcher.matches()) {
            System.out.println("该邮箱是有效的。"); // Translates to "The email is valid."
        } else {
            System.out.println("该邮箱是无效的。"); // Translates to "The email is invalid."
        }
    }
}
