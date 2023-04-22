public class Main {
    public static void main(String[] args) {

        //buda çalışır
        Product product = new Product(
                1,"Laptop","Asus Laptop",5000,3,"siyah"
        );
/*
        //buda çalışır
        product.setId(1);
        product.setName("Laptop");
        product.setPirce(5000);
        product.setDescription("Asus Laptop");
        product.setStockAmount(3);
        product.setColor("siyah");
        product.getId();//sadece okunur yazılamaz!
*/
        ProductManager productManager=new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());
    }
}