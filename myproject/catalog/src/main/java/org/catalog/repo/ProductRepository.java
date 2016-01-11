package org.catalog.repo;

import java.util.List;

import org.catalog.domain.product.ProductDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductDAO, String> {
 
    public void delete(ProductDAO deleted);
 
    public List<ProductDAO> findAll();
 
    public ProductDAO findOne(String id);
 
    public ProductDAO save(ProductDAO saved);
}