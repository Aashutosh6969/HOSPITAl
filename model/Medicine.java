package model;

public class Medicine extends Hospital{
    String type;
    String Brand;
    int code;
    int price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




    public Medicine(String type, String brand, int code, int price) {
        this.type = type;
        Brand = brand;
        this.code = code;
        this.price = price;
    }
    @Override
    public void printFormat(){
        super.printFormat();
        System.out.println("Item Name :" + this.type);
        System.out.println("Item Code :" + this.code);
        System.out.println("Item Brand :" + this.Brand);
        System.out.println("Item Price :" + this.price);
    }
public  void info(){

}
}
