package javalearn.Alist.phone;

import java.util.ArrayList;

/**
 * @author Lenovo
 * @create 2023/3/28 10:15
 **/
public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();


        Phone p1 = new Phone("Apple", 5000);
        Phone p2 = new Phone("Samsung", 3000);
        Phone p3 = new Phone("LG", 2000);

        list.add(p1);
        list.add(p2);
        list.add(p3);

       ArrayList<Phone>PhoneInfoList= GetMinPrice(list);
        for(int i=0; i < PhoneInfoList.size(); i++) {
            Phone p = PhoneInfoList.get(i);
            System.out.println(p.getBrand()+" "+p.getPrice());
        }
    }


   /* public static void GetMinPrice(ArrayList<Phone>list){
        for(int i = 0; i < list.size(); i++){
            Phone p = list.get(i);
            int price = p.getPrice();
            if(price<5000){
                System.out.println(p.getPrice()+" "+p.getBrand());
            }
        }


    }*/

    public static ArrayList<Phone> GetMinPrice(ArrayList<Phone>list)    {
        ArrayList<Phone> resultList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            Phone p = list.get(i);
            int price = p.getPrice();
            if(price<5000){
             resultList.add(p);
            }
        }
        return resultList;
    }
}
