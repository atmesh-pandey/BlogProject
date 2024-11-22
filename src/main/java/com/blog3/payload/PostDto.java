package com.blog3.payload;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class PostDto {
    private Long id;
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;
    @NotEmpty
    @Size(min = 3, message = "Post content should have at least 3 characters")
    private String content;
    @NotEmpty
    @Size(min = 5, message = "Post description should have at least 5 characters")
    private String description;
}
