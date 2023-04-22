public class Oop1 {
    public static void main(String[] args) {

//        Product product1 = new Product();// class değişkeni oluşturma

//        //set value = değer ataması yapıldı
//        product1.name = "Delonghi kahve Makinesi";
//        product1.unitPrice = 7500;
//        product1.discount = 7;
//        product1.unitsInStock = 3;
//        product1.imageUrl = "bilmemne1.jpg";
//
//        //get value = değer okuma
//        //System.out.println(product1.name);


        Product product1 = new Product();// class değişkeni oluşturma
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();// class değişkeni oluşturma
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();// class değişkeni oluşturma
        product3.setName("Kitceh Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");

        Product[] products = {
                product1, product2, product3
        };

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndiVidualCustomer indiVidualCustomer = new IndiVidualCustomer();
        indiVidualCustomer.setId(1);
        indiVidualCustomer.setPhone("052222243435");
        indiVidualCustomer.setCustomerNumber("123456");
        indiVidualCustomer.setFirstName("Doğukan");
        indiVidualCustomer.setLastName("Öztürk");

        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setTaxNumber("111111111111");
        corporateCustomer.setPhone("053333333");
        corporateCustomer.setCompanyName("Doğğukan ŞTİ.");
        corporateCustomer.setCustomerNumber("45612");

        Customer[] customers={
                corporateCustomer,indiVidualCustomer
        };















    }
}