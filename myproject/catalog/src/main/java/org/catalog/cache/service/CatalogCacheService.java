package org.catalog.cache.service;

import org.catalog.domain.product.ProductDAO;
import org.catalog.domain.product.ProductDTO;

public interface CatalogCacheService {
    
    public ProductDTO getProductDTOById(String id);

    public void save(ProductDAO dao);

}
