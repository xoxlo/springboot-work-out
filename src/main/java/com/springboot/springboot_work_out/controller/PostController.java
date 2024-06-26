package com.springboot.springboot_work_out.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.*;
import com.springboot.springboot_work_out.model.Post;
import com.springboot.springboot_work_out.service.PostService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/list")
    public List<Post> postList(@RequestParam String title) {
        return postService.postList(title);
    }
    
    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId) {
        return new Post(UUID.randomUUID(),"title1", "contents1", "", LocalDateTime.now());
    }
}
