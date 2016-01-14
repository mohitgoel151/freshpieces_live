package org.catalog.domain.product;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="productDAO")
public class ProductDAO extends Product {
    
    private Date created;
    private Date lastUpdated;
    
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    

}
