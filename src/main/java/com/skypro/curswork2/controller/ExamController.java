package com.skypro.curswork2.controller;

import com.skypro.curswork2.model.Question;
import com.skypro.curswork2.service.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class ExamController {
    private final ExaminerServiceImpl examinerService;

    public ExamController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("get/{amount}")
    public Collection<Question> getQuestion(@PathVariable("amount") int amount){
        return examinerService.getQuestions(amount);
    }
}
