package com.greenfoxacademy.reddit.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class RedditPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String url;
    private Long score;
    @Temporal(TemporalType.DATE)
    private Date creationDate;

    public RedditPost() {
        this.score = 0L;
        this.creationDate = new Date();
    }

    public RedditPost(String title, String url) {
        this();
        this.title = title;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void increaseScore() {
        this.score++;
    }

    public void decreaseScore() {
        this.score--;
    }
}
