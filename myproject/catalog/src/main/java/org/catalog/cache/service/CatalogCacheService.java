package org.catalog.cache.service;

import org.catalog.domain.product.ProductDTO;

public interface CatalogCacheService {
    
    public ProductDTO getProductById(String id);

}
