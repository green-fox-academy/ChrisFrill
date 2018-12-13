package com.greenfoxacademy.webapplication.controllers;

import com.greenfoxacademy.webapplication.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/gfa")
public class GreenFoxController {

    private StudentService studentService;

    @Autowired
    public GreenFoxController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public String showMainPage(ModelMap modelMap) {
        modelMap.addAttribute("studentCount", studentService.count());
        return "gfa";
    }

    @GetMapping("/list")
    public String showStudentList(ModelMap modelMap) {
        modelMap.addAttribute("students", studentService.findAll());
        return "gfa";
    }

    @GetMapping("/add")
    public String showAddStudent(ModelMap modelMap, @ModelAttribute("student") String student) {
        modelMap.addAttribute("student", student);
        return "gfa-add-student";
    }

    @GetMapping("/save")
    public String saveStudent(@ModelAttribute("student") String student) {
        studentService.save(student);
        return "redirect:/gfa";
    }

    @GetMapping("/check")
    public String checkStudent(ModelMap modelMap, @ModelAttribute("student") String student) {
        modelMap.addAttribute("contains", studentService.checkIfInList(student));
        modelMap.addAttribute(student);
        return "gfa-check-student";
    }
}
