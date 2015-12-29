package org.catalog.service;

import java.util.List;

import org.catalog.domain.Product;
import org.catalog.domain.ProductImpl;
import org.catalog.domain.common.Category;
import org.catalog.domain.dto.TodoDTO;


public interface CatalogService {
    
    TodoDTO create(TodoDTO todo);
    
    TodoDTO delete(String id);
 
    List<TodoDTO> findAll();
 
    TodoDTO findById(String id);
 
    TodoDTO update(TodoDTO todo);
    
    //Product related apis
    public ProductImpl getProductById(String id);
    
    public ProductImpl getProductByName(String productName);
 
    public boolean addProductToCatalog(Product product);
    
    public boolean removeProductFromCatalog(Product product);
    
    public Product updateProduct(Product product);
    
    public List<Product> getSimilarProductsById(String id);
    
    public List<Product> getSimilarProductsById(String searchName, int limit, int offset);
    
    public List<Product> getSimilarProductsByName(String productName);
    
    public List<Product> getSimilarProductsByName(String searchName, int limit, int offset);
    
    public List<Product> getSimilarProductsByCategory(Category category, int limit, int offset);
    
    //Category related apis
    public List<Category> findAllCategories();

    public List<Category> findAllCategories(int limit, int offset);

    public List<Product> findAllProducts();

    public List<Product> findAllProducts(int limit, int offset);

    public List<Product> findProductsForCategory(Category category);

    public List<Product> findProductsForCategory(Category category, int limit, int offset);
    

}
