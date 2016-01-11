package org.catalog.service;

import org.catalog.domain.product.Product;

public interface CatalogAdminService {
	
    public boolean addProductToCatalog(Product product);
    
    public boolean removeProductFromCatalog(Product product);
    
    public Product updateProduct(Product product);

}
