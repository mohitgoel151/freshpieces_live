package org.catalog.domain.common;

import java.util.List;

public class Multimedia {
    
    private List<ImageSet> imageSets;
    
    private List<VideoURL> videoURLs;

    public List<ImageSet> getImageSets() {
        return imageSets;
    }

    public void setImageSets(List<ImageSet> imageSets) {
        this.imageSets = imageSets;
    }

    public List<VideoURL> getVideoURLs() {
        return videoURLs;
    }

    public void setVideoURLs(List<VideoURL> videoURLs) {
        this.videoURLs = videoURLs;
    }

}
