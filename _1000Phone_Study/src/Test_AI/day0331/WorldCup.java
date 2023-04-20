package Test_AI.day0331;
/**
 * @author Jerforce
 * @date 2023/4/6 星期四 20:04:15
 */
import java.util.*;

public class WorldCup {
    public static void main(String[] args) {
        Map<Integer, String> worldCup = new HashMap<>();
        worldCup.put(2006, "意大利");
        worldCup.put(2002, "巴西");
        worldCup.put(1998, "法国");
        worldCup.put(1990, "德国");
        worldCup.put(1986, "阿根廷");
        worldCup.put(1982, "意大利");
        worldCup.put(1978, "阿根廷");
        worldCup.put(1974, "德国");
        worldCup.put(1970, "巴西");
        worldCup.put(1966, "英格兰");
        worldCup.put(1962, "巴西");

        // 遍历集合输出年份以及对应获得冠军的球队名字
        for (Map.Entry<Integer, String> entry : worldCup.entrySet()) {
            System.out.println(entry.getKey() + "年：" + entry.getValue());
        }


        // 从控制台输入一支球队的名字，输出该球队获得冠军的年份列表
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入球队名字：");
        String team = scanner.nextLine().substring(0, 2);
        boolean hasWon = false;
        for (Map.Entry<Integer, String> entry : worldCup.entrySet()) {
            if (entry.getValue().equals(team)) {
                System.out.println(entry.getKey()+"年");
                hasWon = true;
            }
        }
        if (!hasWon) {
            System.out.println("没有获得过世界杯冠军");
        }
    }
}