package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.service.PostService;
import com.greenfoxacademy.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/submit")
    public String showSubmit(@ModelAttribute("post") Post post) {
        return "submit";
    }

    @PostMapping("/submit")
    public String submitNewPost(@ModelAttribute("post") Post post) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = ((UserDetails)principal).getUsername();
        User user = userService.findByUsername(username);
        Post newPost = new Post(post.getTitle(), post.getUrl(), user);
        postService.save(newPost);
        System.out.println(username);
        System.out.println(newPost);
        return "redirect:";
    }

    @PostMapping("/upvote")
    public String upVote(@ModelAttribute("id") String id) {
        postService.upVote(id);
        return "redirect:";
    }

    @PostMapping("/downvote")
    public String downVote(@ModelAttribute("id") String id) {
        postService.downVote(id);
        return "redirect:";
    }

}
