package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedditController {
    private PostService postService;

    @Autowired
    public RedditController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String showIndex(Model model,
                            @RequestParam(defaultValue = "1") int page,
                            @ModelAttribute("user") User user) {
        model.addAttribute("posts", postService.showByTen(page-1));
        model.addAttribute("page", page);
        model.addAttribute("userForm", new User());
        return "index";
    }

}
