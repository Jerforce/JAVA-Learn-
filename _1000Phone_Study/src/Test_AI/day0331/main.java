package Test_AI.day0331;
import java.io.*;
/**
 * @author Jerforce
 * @date 2023/4/6 星期四 11:30:28
 */

public class main {
    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "dir");
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while (true) {
                line = r.readLine();
                if (line == null) { break; }
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
