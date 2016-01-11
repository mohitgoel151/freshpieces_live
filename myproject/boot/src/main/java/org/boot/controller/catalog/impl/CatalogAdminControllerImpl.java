package org.boot.controller.catalog.impl;

import org.boot.controller.catalog.CatalogAdminController;
import org.catalog.domain.product.ProductDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/product")
public class CatalogAdminControllerImpl implements CatalogAdminController {
	
    @RequestMapping(value = "add", method = RequestMethod.POST, consumes = "application/json")
    public String addProduct(@RequestBody ProductDTO newProduct) {
        //check by product service if it exists
        //if not create
        return "added";
    }
    
    @RequestMapping(value = "update/{name}", method = RequestMethod.PUT)
    public String updateProduct(@PathVariable("name") String productName, @RequestBody ProductDTO newProduct) {
        
        return "updated";
    }
    
    @RequestMapping(value = "delete/{name}", method = RequestMethod.PUT)
    public String deleteProduct(@PathVariable("name") String productName) {
        
        return "deleted";
    }

}
