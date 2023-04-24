public class Main {
    public static void main(String[] args) {
        //bir class birden fazla interfac i implemente edebilir
        //interface lerde abstrac sınıflar gibi newlenemezler!

        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();


    }
}