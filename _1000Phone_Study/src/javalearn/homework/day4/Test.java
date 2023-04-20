package javalearn.homework.day4;

/**
 * @author Lenovo
 * @create 2023/3/22 18:03
 **/
public class Test {
    public static void print99(){
        for(int i=1;i<=9;i++){
            for (int j=1;j<=9;j++) {
                if (j<=i){
                    System.out.print(j+"x"+i+"="+(i*j)+"\t");
                }
            }
            System.out.println("");
        }

    }
    public static void main(String[] args) {
        print99();
    }

}