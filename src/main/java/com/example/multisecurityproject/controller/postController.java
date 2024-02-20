package com.example.multisecurityproject.controller;

import com.example.multisecurityproject.model.Post;
import com.example.multisecurityproject.repository.postRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class postController {

    private final postRepository repository;

    public postController(postRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Post> findAll()
    {
        return repository.findAll();
    }
}
