package org.catalog.db.service;

import java.util.List;

import org.catalog.domain.category.CategoryDAO;
import org.catalog.domain.product.ProductDAO;

public interface CatalogDbService {
    
    public void saveProduct(ProductDAO product);
    public boolean updateProduct(ProductDAO product);
    
    public void deleteProduct(ProductDAO product);
    public void deleteProductById(String productId);
    
    public ProductDAO getProductById(String id);   
    public ProductDAO getProductByName(String name);
       
    public void saveCategory(CategoryDAO product);
    public boolean updateCategory(CategoryDAO product);
    
    public void deleteCategory(CategoryDAO category);
    public void deleteCategoryById(String categoryId);
    
    public List<CategoryDAO> getAllCategories();
    public CategoryDAO getCategoryById(String id);

}
