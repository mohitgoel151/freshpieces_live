package org.catalog.repo;

import java.util.List;

import org.catalog.domain.product.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@Component
//@RepositoryRestResource(collectionResourceRel = "location", path = "location")
public interface TodoRepository extends MongoRepository<Todo, String> {
 
    void delete(Todo deleted);
 
    List<Todo> findAll();
 
    Todo findOne(String id);
 
    Todo save(Todo saved);
}