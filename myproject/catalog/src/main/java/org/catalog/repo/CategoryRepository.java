package org.catalog.repo;

import java.util.List;

import org.catalog.domain.category.CategoryDAO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryDAO, String> {
 
    public void delete(CategoryDAO deleted);
 
    public List<CategoryDAO> findAll();
 
    public CategoryDAO findOne(String id);
 
    public CategoryDAO save(CategoryDAO saved);
}
