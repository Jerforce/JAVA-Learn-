package javalearn.oop.opp3;

/**
 * @author Lenovo
 * @create 2023/3/27 11:59
 **/
public class GoodsTest {
    public static void main(String[] args) {


        Goods[] goods = new Goods[3];
        Goods goods1 = new Goods("101", "苹果", 1000, 10);
        Goods goods2 = new Goods("102", "华为", 1000, 10);
        Goods goods3 = new Goods("103", "小米", 800, 20);

        goods[0] = goods1;
        goods[1] = goods2;
        goods[2] = goods3;
        for(int i = 0;i<goods.length;i++){
            Goods good = goods[i];
            System.out.println(good.getId()+","+good.getName()+","+good.getPrice()+","+good.getCount());
        }
    }
}
