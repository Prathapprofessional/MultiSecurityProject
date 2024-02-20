package com.example.multisecurityproject.repository;

import com.example.multisecurityproject.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface postRepository extends ListCrudRepository<Post, Integer> {

}
