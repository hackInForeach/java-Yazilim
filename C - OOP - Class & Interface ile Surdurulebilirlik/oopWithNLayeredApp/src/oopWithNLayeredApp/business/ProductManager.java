package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers){
        this.productDao=productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception{
        //iş kuralları

        //bu kötü kod
        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz.");
        }
        productDao.add(product);

//        JdbcProductDao productDao=new JdbcProductDao();
//        productDao.add(product);

        // bir katman başka bir katmanın clasını kullanıyorken sadece interface inden erişim kurmalıdır.


        for (Logger logger:loggers){
            logger.log(product.getName());
        }


    }
}
