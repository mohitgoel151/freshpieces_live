package org.catalog.service.convertor;

import org.catalog.domain.product.ProductDAO;
import org.catalog.domain.product.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public class DataConverterService {
    
    public ProductDAO convertToProductDAO(ProductDTO productDTO) {
        
        return null;
    }

    public ProductDTO convertToProductDTO(ProductDAO productDAO) {
        
        if(productDAO == null) {
            return null;
        }
        
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(productDAO.getId());
        
        productDTO.setAsin(productDAO.getAsin());
        productDTO.setParentAsin(productDAO.getParentAsin());
        
        productDTO.setTitle(productDAO.getTitle());
        productDTO.setSmallDescription(productDAO.getSmallDescription());
        productDTO.setDescription(productDAO.getDescription());
        
        productDTO.setLabel(productDAO.getLabel());
        productDTO.setModel(productDAO.getModel());
        productDTO.setBrand(productDAO.getBrand());
        
        productDTO.setFeatures(productDAO.getFeatures());
        productDTO.setMultimedia(productDAO.getMultimedia());
        productDTO.setPhysicalProperties(productDAO.getPhysicalProperties());
        
        return productDTO;
    }

}
