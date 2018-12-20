package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.RedditPost;
import org.springframework.data.repository.CrudRepository;

public interface RedditPostRepository extends CrudRepository<RedditPost, Long> {

}
