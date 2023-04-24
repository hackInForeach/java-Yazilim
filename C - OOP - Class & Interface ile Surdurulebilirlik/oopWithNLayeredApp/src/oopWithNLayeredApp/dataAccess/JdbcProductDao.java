package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

    public void add(Product product){
        //sadece ve sace db erişimi kodları buraya yazılır
        System.out.println("JDCB ile veri tabanına eklendi.");

    }


}
