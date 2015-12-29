package org.catalog.service.impl;

import java.util.List;
import java.util.Optional;

import org.catalog.domain.Product;
import org.catalog.domain.ProductImpl;
import org.catalog.domain.Todo;
import org.catalog.domain.common.Category;
import org.catalog.domain.dto.TodoDTO;
import org.catalog.repo.TodoRepository;
import org.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

//@ComponentScan("org.catalog.repo")
@Service
public class CatalogServiceImpl implements CatalogService {
    
    @Autowired
    private TodoRepository repository;
    
//    @Autowired
//    private MongoRepository<Todo, String> repository;
    
//    @Autowired
//    CatalogServiceImpl(TodoRepository repository) {
//        this.repository = repository;
//    }

    @Override
    public ProductImpl getProductById(String id) {
        ProductImpl product = new ProductImpl();
        product.setId(id);
        return product;
    }

    @Override
    public ProductImpl getProductByName(String productName) {
        ProductImpl product = new ProductImpl();
        product.setTitle(productName);
        return product;
    }

    @Override
    public boolean addProductToCatalog(Product product) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeProductFromCatalog(Product product) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Product updateProduct(Product product) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getSimilarProductsById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getSimilarProductsById(String searchName, int limit,
            int offset) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getSimilarProductsByName(String productName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getSimilarProductsByName(String searchName, int limit,
            int offset) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getSimilarProductsByCategory(Category category,
            int limit, int offset) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Category> findAllCategories() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Category> findAllCategories(int limit, int offset) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> findAllProducts() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> findAllProducts(int limit, int offset) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> findProductsForCategory(Category category) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> findProductsForCategory(Category category, int limit,
            int offset) {
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
