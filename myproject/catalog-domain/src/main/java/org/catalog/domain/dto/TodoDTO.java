package org.catalog.domain.dto;

import javax.validation.constraints.Size;

import org.catalog.domain.product.Todo;
import org.hibernate.validator.constraints.NotEmpty;

public class TodoDTO {
    
    private String id;

    @Size(max = Todo.MAX_LENGTH_DESCRIPTION)
    private String description;

    @NotEmpty
    @Size(max = Todo.MAX_LENGTH_TITLE)
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
