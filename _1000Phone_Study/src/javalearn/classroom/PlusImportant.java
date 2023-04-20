package javalearn.classroom;

/**
 * @author Lenovo
 * @create 2023/3/22 17:43
 **/
public class PlusImportant {
    public static void main(String[] args) {
        int x = 10; int y = 8;
        System.out.println(x++ - --x + y-- + x++ - --y);


    /*
            用10算11 - 算10用10 + 用8算7 + 用10算11 - 算6用6

            10 - 10 + 8+ 10 - 6

*  	     重点：     在前先算再用  在后先用再算

    *
    *
    * */
    }
}
