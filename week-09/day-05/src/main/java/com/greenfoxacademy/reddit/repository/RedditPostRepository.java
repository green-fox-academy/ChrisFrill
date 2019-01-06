package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.RedditPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.web.PageableDefault;

import javax.persistence.NamedQuery;
import java.util.List;

public interface RedditPostRepository extends JpaRepository<RedditPost, Long> {
    Page<RedditPost> findAll(Pageable pageable);
}