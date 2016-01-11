package org.boot.controller.catalog.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.boot.controller.base.BaseController;
import org.boot.controller.catalog.CatalogController;
import org.catalog.domain.common.Category;
import org.catalog.domain.dto.TodoDTO;
import org.catalog.domain.product.Product;
import org.catalog.domain.product.ProductDTO;
import org.catalog.service.impl.CatalogServiceImpl;
import org.common.domain.response.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan({ "org.catalog", "org.catalog.repo" })
@RestController
public class CatalogControllerImpl extends BaseController implements CatalogController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CatalogControllerImpl.class);

    @Autowired
    private CatalogServiceImpl catalogService;

    @Override
    public ApiResponse<ProductDTO> getProductById(@PathVariable("id") String id, HttpServletResponse response) throws Exception {
        
        ApiResponse<ProductDTO> resp = new ApiResponse<ProductDTO>();
        
        
        //resp.setResponse((ProductDTO) catalogService.getProductById(id));
        
        response.setStatus(HttpStatus.OK.value());
        serveRequest(id, resp, catalogService::getProductById);
        
        return resp;
    }
    

    


    @Override
    public ProductDTO getProductByName(@PathVariable("name") String productName) {
        ProductDTO prod = (ProductDTO) catalogService.getProductByName(productName);
        return prod;
    }

    @Override
    public List<ProductDTO> getSimilarProductsById(
            @PathVariable("id") String id, int limit, int offset) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getSimilarProductsByName(
            @PathVariable("name") String searchName, int limit, int offset) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<Product> findAllProducts(int limit, int offset) {
        
        return null;
    }

    @Override
    public List<Category> findAllCategories() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> findProductsForCategory(
            @PathVariable("name") String categoryName, int limit, int offset) {
        // TODO Auto-generated method stub
        return null;
    }

    @RequestMapping(value = "todo/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public TodoDTO createTODO(@RequestBody TodoDTO todo) {
        TodoDTO a = catalogService.create(todo);
        return a;
    }

    @RequestMapping(value = "todo/{id}", method = RequestMethod.GET)
    public TodoDTO createTODO(@PathVariable("id") String id) {
        TodoDTO a = catalogService.findById(id);
        return a;
    }





    @Override
    public List<ProductDTO> getFeaturedProductsOfTheWeek() {
        // TODO Auto-generated method stub
        return null;
    }





    @Override
    public List<ProductDTO> getFeaturedProductsOfTheDay() {
        // TODO Auto-generated method stub
        return null;
    }

}
