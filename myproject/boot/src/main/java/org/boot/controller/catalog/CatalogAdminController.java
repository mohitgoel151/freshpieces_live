package org.boot.controller.catalog;

import org.catalog.domain.product.ProductDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface CatalogAdminController {
	
    @RequestMapping(value = "add", method = RequestMethod.POST, consumes = "application/json")
    public String addProduct(@RequestBody ProductDTO newProduct);
    
    @RequestMapping(value = "update/{name}", method = RequestMethod.PUT)
    public String updateProduct(@PathVariable("name") String productName, @RequestBody ProductDTO newProduct);
    
    @RequestMapping(value = "delete/{name}", method = RequestMethod.PUT)
    public String deleteProduct(@PathVariable("name") String productName);

}
