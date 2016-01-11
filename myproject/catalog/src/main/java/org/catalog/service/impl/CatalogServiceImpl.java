package org.catalog.service.impl;

import java.util.List;

import org.catalog.cache.service.CatalogCacheService;
import org.catalog.db.service.CatalogDbService;
import org.catalog.domain.common.Category;
import org.catalog.domain.dto.TodoDTO;
import org.catalog.domain.product.Product;
import org.catalog.domain.product.ProductDTO;
import org.catalog.domain.product.Todo;
import org.catalog.repo.TodoRepository;
import org.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {
    
    @Autowired
    private CatalogCacheService cacheService;
    
    @Autowired
    private CatalogDbService dbService;
    
    @Autowired
    private TodoRepository repository;
    
    @Override
    public ProductDTO getProductById(String id) {
        ProductDTO product = new ProductDTO();
        product.setId(id);
        return product;
    }

    @Override
    public ProductDTO getProductByName(String productName) {
        ProductDTO product = new ProductDTO();
        product.setTitle(productName);
        return product;
    }


    @Override
    public List<Product> getSimilarProductsById(String searchName, int limit, int offset) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public List<Product> getSimilarProductsByName(String searchName, int limit, int offset) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public List<Category> findAllCategories() {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public List<Product> findAllProducts(int limit, int offset) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public List<Product> findProductsForCategory(Category category, int limit, int offset) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TodoDTO create(TodoDTO todo) {
//        Todo persisted = Todo.getBuilder()
//                .title(todo.getTitle())
//                .description(todo.getDescription())
//                .build();
        Todo persisted = new Todo();
        persisted.setId(todo.getId());
        persisted.setTitle(todo.getTitle());
        persisted = repository.save(persisted);
        return convertToDTO(persisted);
    }
 
    @Override
    public TodoDTO delete(String id) {
        Todo deleted = findTodoById(id);
        repository.delete(deleted);
        return convertToDTO(deleted);
    }
 
    @Override
    public List<TodoDTO> findAll() {
        List<Todo> todoEntries = repository.findAll();
        return null;//convertToDTOs(todoEntries);
    }
 
//    private List<TodoDTO> convertToDTOs(List<Todo> models) {
//        return models.stream()
//                .map(this::convertToDTO)
//                .collect(toList());
//    }
 
    @Override
    public TodoDTO findById(String id) {
        Todo found = findTodoById(id);
        return convertToDTO(found);
    }
 
    @Override
    public TodoDTO update(TodoDTO todo) {
        Todo updated = findTodoById(todo.getId());
        //updated.update(todo.getTitle(), todo.getDescription());
        updated = repository.save(updated);
        return convertToDTO(updated);
    }
    
    private Todo findTodoById(String id) {
        //Optional<Todo> result = repository.findOne(id);
        //return null;// result.orElseThrow(() -> new TodoNotFoundException(id));
        return repository.findOne(id);
    }
 
    private TodoDTO convertToDTO(Todo model) {
        TodoDTO dto = new TodoDTO();
 
        dto.setId(model.getId());
        dto.setTitle(model.getTitle());
        dto.setDescription(model.getDescription());
 
        return dto;
    }


}
