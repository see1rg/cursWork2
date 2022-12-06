package com.skypro.curswork2.controller;

import com.skypro.curswork2.model.Question;
import com.skypro.curswork2.service.JavaQuestionService;
import com.skypro.curswork2.service.QuestionService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaController{
    private final  QuestionService questionService;

    public JavaController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("get")
   public Collection<Question> getQuestion() {

    }

    @GetMapping("add")
    public Question addQuestion(@PathParam("question") String question,
                                @PathParam("answer") String answer){
        return questionService.add(question, answer);
    }

    @GetMapping("remove")
    public   Question removeQuestion(@PathParam("question") String question,
                                   @PathParam("answer") String answer) {
        Question temp = new Question(question, answer);

       return questionService.remove(temp);
    }
}
