package org.catalog.domain;

import java.util.List;

import org.catalog.domain.common.Category;
import org.catalog.domain.common.Feature;
import org.catalog.domain.common.ImageSet;
import org.catalog.domain.common.Offers;
import org.catalog.domain.common.PhysicalProperties;
import org.catalog.domain.common.Price;


//@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductImpl {// implements Product {
	
	private String id;
	
	private String asin;
	private String parentAsin;
	
	private boolean isAvailable;
	private boolean isActive;
	private boolean isOnSale;
	private int quantityAvailable;
	
	private String title;
	private String label;
	private String model; 
	private String brand;
	private String description;
	
	private String productGroup;
	private String productTypeName;
	private int packageQuantity;
	
	
	private PhysicalProperties physicalProperties;
	private Price price;
	private List<Offers> offers;
	private List<Category> categories;
	private List<Feature> features;
	private List<ImageSet> imageSets;
	
//	private List<SimilarProduct> similarProducts;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAsin() {
        return asin;
    }
    public void setAsin(String asin) {
        this.asin = asin;
    }
    public String getParentAsin() {
        return parentAsin;
    }
    public void setParentAsin(String parentAsin) {
        this.parentAsin = parentAsin;
    }
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
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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
    public PhysicalProperties getPhysicalProperties() {
        return physicalProperties;
    }
    public void setPhysicalProperties(PhysicalProperties physicalProperties) {
        this.physicalProperties = physicalProperties;
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
    public List<Feature> getFeatures() {
        return features;
    }
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
    public List<ImageSet> getImageSets() {
        return imageSets;
    }
    public void setImageSets(List<ImageSet> imageSets) {
        this.imageSets = imageSets;
    }

}
