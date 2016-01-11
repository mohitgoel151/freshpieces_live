package org.catalog.db.service.impl;

import java.util.List;

import org.catalog.db.service.CatalogDbService;
import org.catalog.domain.category.CategoryDAO;
import org.catalog.domain.product.ProductDAO;
import org.catalog.repo.CategoryRepository;
import org.catalog.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogDbServiceImpl implements CatalogDbService {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    @Override
    public void saveProduct(ProductDAO product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean updateProduct(ProductDAO product) {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public void deleteProduct(ProductDAO product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteProductById(String productId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ProductDAO getProductById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductDAO getProductByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void saveCategory(CategoryDAO product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean updateCategory(CategoryDAO product) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<CategoryDAO> getAllCategories() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CategoryDAO getCategoryById(String id) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public void deleteCategory(CategoryDAO category) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteCategoryById(String categoryId) {
        // TODO Auto-generated method stub
        
    }

}
