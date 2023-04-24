import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DataBaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1=new Product(1,"İphone",10000);

        Logger[] loggers={new DataBaseLogger(),new FileLogger(),new MailLogger()};

        ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);

        productManager.add(product1);



    }
}