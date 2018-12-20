package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.RedditPost;
import com.greenfoxacademy.reddit.repository.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RedditPostService {
    private RedditPostRepository redditPostRepository;

    @Autowired
    public RedditPostService(RedditPostRepository redditPostRepository) {
        this.redditPostRepository = redditPostRepository;
    }

    public Iterable<RedditPost> findAll() {
        return redditPostRepository.findAll();
    }

    public RedditPost save(RedditPost post) {
        return redditPostRepository.save(post);
    }

    public Optional<RedditPost> findById(Long id) {
        return redditPostRepository.findById(id);
    }

    public void upVote(String id) {
        Long convertedID = Long.parseLong(id);
        RedditPost post = redditPostRepository.findById(convertedID).get();
        post.increaseScore();
        redditPostRepository.save(post);
    }

    public void downVote(String id) {
        Long convertedID = Long.parseLong(id);
        RedditPost post = redditPostRepository.findById(convertedID).get();
        post.decreaseScore();
        redditPostRepository.save(post);
    }
}
