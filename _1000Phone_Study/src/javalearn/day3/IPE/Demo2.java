package javalearn.day3.IPE;

/**
 * @author Lenovo
 * @create 2023/3/24 16:57
 **/
public class Demo2 {
    public void exam() {
        this.openPage();
        this.answer();
        this.colorPage();
        this.closePage();


    }
        public void openPage () {
            System.out.println("打开试卷");
            System.out.println("检查试卷");
            System.out.println("填写试卷");

        }
        public void answer () {
            System.out.println("答题");
        }

        public void colorPage () {
            System.out.println("涂答题卡");
        }
        public void closePage () {
            System.out.println("试卷上交");
        }



}
