package org.boot.controller.catalog;

import org.catalog.domain.ProductImpl;
import org.catalog.domain.Todo;
import org.catalog.domain.dto.TodoDTO;
import org.catalog.service.impl.CatalogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan({"org.catalog", "org.catalog.repo"})
@RestController
@RequestMapping("product/")
public class CatalogController {

    @Autowired
    private CatalogServiceImpl catalogService;

    @RequestMapping(value = "id/{id}", method = RequestMethod.GET, produces = "application/json")
    public ProductImpl getProductById(@PathVariable("id") String id) {
        ProductImpl prod = (ProductImpl) catalogService.getProductById(id);
        return prod;
    }

    @RequestMapping(value = "name/{name}", method = RequestMethod.GET)
    public ProductImpl getProductByName(@PathVariable("name") String productName) {
        ProductImpl prod = (ProductImpl) catalogService.getProductByName(productName);
        return prod;
    }

    @RequestMapping(value = "add", method = RequestMethod.POST, consumes = "application/json")
    public String addProduct(@RequestBody ProductImpl newProduct) {
        //check by product service if it exists
        //if not create
        return "added";
    }
    
    @RequestMapping(value = "update/{name}", method = RequestMethod.PUT)
    public String updateProduct(@PathVariable("name") String productName, @RequestBody ProductImpl newProduct) {
        
        return "updated";
    }
    
    @RequestMapping(value = "delete/{name}", method = RequestMethod.PUT)
    public String deleteProduct(@PathVariable("name") String productName) {
        
        return "deleted";
    }
    
    
    @RequestMapping(value = "todo/create", method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public TodoDTO createTODO(@RequestBody TodoDTO todo) {
        TodoDTO a = catalogService.create(todo);
        return a;
    }
    
    @RequestMapping(value = "todo/{id}", method = RequestMethod.GET)
    public TodoDTO createTODO(@PathVariable("id") String id) {
        TodoDTO a = catalogService.findById(id);
        return a;
    }
}
