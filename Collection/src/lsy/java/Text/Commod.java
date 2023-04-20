package lsy.java.Text;

public class Commod {
     private String name;
   private String type;
    private  double price;
    private  int invent;

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInvent() {
        return invent;
    }

    public void setInvent(int invent) {
        this.invent = invent;
    }

    public  Commod(){}

    public Commod(String name, String type, double price,int invent) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.invent =invent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }
    public void printf(){
        System.out.println("ID:"+name+"\tType:"+type+"\t价格:"+price+"\t库存"+invent);
    }
}
