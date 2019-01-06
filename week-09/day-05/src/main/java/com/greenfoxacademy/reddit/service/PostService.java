package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    public void upVote(String id) {
        Long convertedID = Long.parseLong(id);
        Post post = postRepository.findById(convertedID).get();
        post.increaseScore();
        postRepository.save(post);
    }

    public void downVote(String id) {
        Long convertedID = Long.parseLong(id);
        Post post = postRepository.findById(convertedID).get();
        post.decreaseScore();
        postRepository.save(post);
    }

    public Page<Post> showByTen(int pageNumber) {
        return postRepository.findAll(PageRequest.of(pageNumber, 10, Sort.by("score").descending()));
    }

}
