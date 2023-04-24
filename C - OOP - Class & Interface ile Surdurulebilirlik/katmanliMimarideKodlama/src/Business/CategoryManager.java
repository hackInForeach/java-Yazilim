package Business;

import DataAccess.CategoryDao;
import Entities.Category;
import Logging.Logger;

import java.util.List;
import java.util.Objects;

public class CategoryManager {
    private final CategoryDao categoryDao;
    private final List<Logger> loggers;
    private final List<Category> categories;

    public CategoryManager(CategoryDao categoryDao,List<Logger> loggers , List<Category> categories){
        this.categories=categories;
        this.categoryDao=categoryDao;
        this.loggers=loggers;
    }
    public void add(Category category)throws Exception{
        for (Category category1:categories){
            if (Objects.equals(category1.getName(),category.getName())){
                throw new Exception("Bu kategori mevcut.");
            }
        }categoryDao.add(category);
        for (Logger logger:loggers){
            logger.log(category.getName());
        }
    }
}
