package org.catalog.repo;

import java.util.List;

import org.catalog.domain.ProductImpl;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogRepository extends MongoRepository<ProductImpl, String> {
 
    public void delete(ProductImpl deleted);
 
    public List<ProductImpl> findAll();
 
    public ProductImpl findOne(String id);
 
    public ProductImpl save(ProductImpl saved);
}