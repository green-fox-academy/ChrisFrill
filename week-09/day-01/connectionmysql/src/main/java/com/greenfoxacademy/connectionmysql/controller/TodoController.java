package com.greenfoxacademy.connectionmysql.controller;

import com.greenfoxacademy.connectionmysql.model.Todo;
import com.greenfoxacademy.connectionmysql.repository.TodoRepository;
import com.greenfoxacademy.connectionmysql.service.TodoService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {
    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(required = false) String isActive) {
        if (isActive != null) {
            if (isActive.equals("true")) {
                model.addAttribute("todos", todoRepository.findAllByDone(false));
            }
        } else {
            model.addAttribute("todos", todoRepository.findAll());
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String showAdd(@ModelAttribute("todo") Todo todo){
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("todo") Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(Model model, @PathVariable Long id) {
        model.addAttribute("todo", todoRepository.findById(id).get());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String edit(@ModelAttribute("todo") Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/describe")
    public String describe(Model model, @PathVariable("id") Long id) {
        model.addAttribute("todo", todoRepository.findById(id).get());
        return "description";
    }
}
