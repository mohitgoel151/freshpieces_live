package org.catalog.domain.product;

import java.util.List;

import org.catalog.domain.common.Feature;
import org.catalog.domain.common.Multimedia;
import org.catalog.domain.common.PhysicalProperties;

public class Product {

    private String id;

    private String asin;
    private String parentAsin;

    private String title;
    private String smallDescription;
    private String description;
        
    private String label;
    private String model; 
    private String brand;

    private List<Feature> features; 
    private Multimedia multimedia;
    private PhysicalProperties physicalProperties;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSmallDescription() {
        return smallDescription;
    }

    public void setSmallDescription(String smallDescription) {
        this.smallDescription = smallDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    public PhysicalProperties getPhysicalProperties() {
        return physicalProperties;
    }

    public void setPhysicalProperties(PhysicalProperties physicalProperties) {
        this.physicalProperties = physicalProperties;
    }
}
