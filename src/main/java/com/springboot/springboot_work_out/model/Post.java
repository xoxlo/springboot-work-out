package com.springboot.springboot_work_out.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Post {
    private String postId;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createDateTime;
}