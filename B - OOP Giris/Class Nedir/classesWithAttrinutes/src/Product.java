import javax.swing.*;

public class Product {

    public Product(int id, String name, String descriptioni, double pirce, int stockAmount, String color){
        System.out.println("Yapıcı blok çalıştı.");
        //consractar: class ismi ile aynıdır ve anlamı: parametreleri girdiğinde "bana bu parametremeleri vermek zorundasın vermezsen çalışmama" demek
        this.id=id;
        this.name=name;
        this.description=descriptioni;
        this.pirce=pirce;
        this.stockAmount=stockAmount;
        this.color=color;


    }
    // her iki türlüde çalışsın istersen aşırı tükleme overloding yapmalısın=>
    public Product(){

    }
//ürün ait bilgiler
    private int id;
    private String name;
    private String description;
    private double pirce;
    private int stockAmount;
    private String color;
    private String code;


    //    public int getId(){ // okumak için get.
//        return this._id;
//    }
//
//    // yazmak için set kullanılır
//    public void setId(int id){
//        this._id=id;//this. = benim içerisinde  bulunduğum class demek
//    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPirce() {
        return pirce;
    }

    public void setPirce(double pirce) {
        this.pirce = pirce;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode() {
         return this.name.substring(0,1)+id;
    }







}
