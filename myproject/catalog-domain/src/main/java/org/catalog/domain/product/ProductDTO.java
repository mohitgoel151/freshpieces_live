package org.catalog.domain.product;

import java.util.List;

import org.catalog.domain.common.Category;
import org.catalog.domain.common.Feature;
import org.catalog.domain.common.ImageSet;
import org.catalog.domain.common.Multimedia;
import org.catalog.domain.common.Offers;
import org.catalog.domain.common.PhysicalProperties;
import org.catalog.domain.common.Price;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductDTO extends Product {
	
 // private List<SimilarProduct> similarProducts;
	private boolean isAvailable;
    private boolean isActive;
    private boolean isOnSale;
    private int quantityAvailable;
    

    private String productGroup;
    private String productTypeName;
    private int packageQuantity;
    
    
    
    private Price price;
    private List<Offers> offers;
    private List<Category> categories;
    

    
	public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean isOnSale) {
        this.isOnSale = isOnSale;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public int getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(int packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<Offers> getOffers() {
        return offers;
    }

    public void setOffers(List<Offers> offers) {
        this.offers = offers;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }



}
