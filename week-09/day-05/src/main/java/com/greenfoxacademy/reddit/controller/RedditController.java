package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.RedditPost;
import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.service.RedditPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedditController {
    private RedditPostService redditPostService;

    @Autowired
    public RedditController(RedditPostService redditPostService) {
        this.redditPostService = redditPostService;
    }

    @GetMapping("/")
    public String showIndex(Model model,
                            @RequestParam(defaultValue = "1") int page,
                            @ModelAttribute("user") User user) {
        model.addAttribute("posts", redditPostService.showByTen(page-1));
        model.addAttribute("page", page);
        model.addAttribute("userForm", new User());
        return "index";
    }

    @GetMapping("/submit")
    public String showSubmit(@ModelAttribute("post") RedditPost post) {
        return "submit";
    }

    @PostMapping("/submit")
    public String submitNewPost(@ModelAttribute("post") RedditPost post) {
        redditPostService.save(post);
        return "redirect:";
    }

    @PostMapping("/upvote")
    public String upVote(@ModelAttribute("id") String id) {
        redditPostService.upVote(id);
        return "redirect:";
    }

    @PostMapping("/downvote")
    public String downVote(@ModelAttribute("id") String id) {
        redditPostService.downVote(id);
        return "redirect:";
    }

}
