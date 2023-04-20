package lsy.java.Text;

import java.util.Arrays;
import java.util.Scanner;

class Admin extends Tool {
    public Commod[] cm;
    int count = 0;//用于记录数组中的元素个数

    public Admin(int size) {
        if (size <= 0) {
            cm = new Commod[5];
        } else
            cm = new Commod[size];
    }
    @Override//添加数据
    void add(Commod z) {
        int legth = cm.length;
        if (count >= legth) {
            int newlegth = cm.length * 2;
            cm = Arrays.copyOf(cm, newlegth);
        }
        cm[count] = z;
        count++;
    }
    //单独添加
    public void addone(){
        Commod a =new Commod();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入添加的商品信"+"\n"+"商品名称:");
        a.setName(input.next());
        System.out.println("商品类型:");
        a.setType(input.next());
        System.out.println("商品价格:");
        a.setPrice(input.nextDouble());
        System.out.println("商品库存:");
        a.setInvent(input.nextInt());
        int legth = cm.length;
        if (count >= legth) {
            int newlegth = cm.length * 2;
            cm = Arrays.copyOf(cm, newlegth);
        }
        cm[count] = a;
        count++;

    }

    @Override//删除数据
    void delte() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要删除的商品id:");
        String id =input.next();
        for (int i = 0;i< count;i++){
            if (id.equals(cm[i].getName())){
                for (int k = i;k < count -1;k++) {
                    cm[i] = cm[i + 1];
                }
                cm[count-1]= null;
                break;
            }
        }
    }
    @Override//查找数据
    Commod find() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要操作的商品id:");
        String id =input.next();
        for (int i = 0;i < count;i++){
            if (id.equals(cm[i].getName())){
                System.out.println("存在该商品，详细信息为:");
                cm[i].printf();
                System.out.println("----------------");
                return cm[i];
            }
        }
        System.out.println("未查询到该商品");
        return null;
    }
    //修改数据
    public  void revise(){
        Commod temp = find();
        Scanner input = new Scanner(System.in);
        if (temp != null){
            System.out.println("请输入修改后的商品信息:"+"\n"+"修改后的商品名称:");
           temp.setName(input.next());
            System.out.println("商品类型:");
           temp.setType(input.next());
            System.out.println("商品价格:");
           temp.setPrice(input.nextDouble());
            System.out.println("商品库存:");
            temp.setInvent(input.nextInt());
        }
        }
    //打印数组信息
    public void printfInfo(){
        for (int i = 0;i < count;i++){
            if (cm[i] != null) cm[i].printf();
        }
    }


}


