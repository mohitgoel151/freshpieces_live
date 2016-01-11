package org.catalog.service;

import java.util.List;

import org.catalog.domain.common.Category;
import org.catalog.domain.dto.TodoDTO;
import org.catalog.domain.product.Product;
import org.catalog.domain.product.ProductDTO;


public interface CatalogService {

    //Product related apis
    public List<Product> findAllProducts(int limit, int offset);
    
    public ProductDTO getProductById(String id);
    
    public ProductDTO getProductByName(String productName);
     
    public List<Product> getSimilarProductsById(String searchName, int limit, int offset);

    public List<Product> getSimilarProductsByName(String searchName, int limit, int offset);
    
    

    //Category related apis
    public List<Category> findAllCategories();

    public List<Product> findProductsForCategory(Category category, int limit, int offset);
    
    
    
    TodoDTO create(TodoDTO todo);
    
    TodoDTO delete(String id);
 
    List<TodoDTO> findAll();
 
    TodoDTO findById(String id);
 
    TodoDTO update(TodoDTO todo);
    

}
