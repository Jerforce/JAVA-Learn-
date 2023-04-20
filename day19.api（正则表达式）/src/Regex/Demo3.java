package Regex;

/**
 * @author Jerforce
 * @date 2023/4/1 星期六 11:00:15
 */
public class Demo3 {
    public static void main(String[] args) {
        // "\ " '\'转义字符 改变后面那个字符后面的含义
        //打印一个双引号
        System.out.println("\"");
        // "\\w"和 "[a-zA-Z_0-9]" 相同
        System.out.println("_" .matches("[a-zA-Z_0-9]")? "是" : "否");
        System.out.println("_".matches("\\w")? "是" : "否");

    }
}
