package org.catalog.domain.common;

import org.catalog.domain.common.image.Image;

public class ImageSet {
    
    private String category;
    private Image image;
    
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }

}
