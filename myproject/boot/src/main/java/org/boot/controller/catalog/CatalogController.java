package org.boot.controller.catalog;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.catalog.domain.common.Category;
import org.catalog.domain.product.Product;
import org.catalog.domain.product.ProductDTO;
import org.common.domain.response.ApiResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "catalog/", produces = "application/json")
public interface CatalogController {

    // Product related apis
    @RequestMapping(value = "products", method = RequestMethod.GET)
    public List<Product> findAllProducts(
            @RequestParam(value = "limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "offset", required = false, defaultValue = "0") int offset);

    @RequestMapping(value = "products/id/{id}", method = RequestMethod.GET)
    public ApiResponse<ProductDTO> getProductById(
            @PathVariable("idValue") String id, HttpServletResponse response)
            throws Exception;

    @RequestMapping(value = "products/name/{name}", method = RequestMethod.GET)
    public ProductDTO getProductByName(@PathVariable("name") String productName);

    @RequestMapping(value = "products/similar/id/{id}", method = RequestMethod.GET)
    public List<ProductDTO> getSimilarProductsById(
            @PathVariable("id") String id,
            @RequestParam(value = "limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "offset", required = false, defaultValue = "0") int offset);

    @RequestMapping(value = "products/similar/name/{name}", method = RequestMethod.GET)
    public List<Product> getSimilarProductsByName(
            @PathVariable("name") String searchName,
            @RequestParam(value = "limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "offset", required = false, defaultValue = "0") int offset);

    // Category related apis
    @RequestMapping(value = "catagories", method = RequestMethod.GET)
    public List<Category> findAllCategories();

    @RequestMapping(value = "catagories/{name}/products", method = RequestMethod.GET)
    public List<Product> findProductsForCategory(
            @PathVariable("name") String categoryName,
            @RequestParam(value = "limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "offset", required = false, defaultValue = "0") int offset);

    // Featured Product
    @RequestMapping(value = "products/featured/week", method = RequestMethod.GET)
    public List<ProductDTO> getFeaturedProductsOfTheWeek();
    //      @RequestParam(value = "filter", required = false, defaultValue = "non-veg") String filter)
    
    @RequestMapping(value = "products/featured/day", method = RequestMethod.GET)
    public List<ProductDTO> getFeaturedProductsOfTheDay();
    //      @RequestParam(value = "filter", required = false, defaultValue = "non-veg") String filter)
}
