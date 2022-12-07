package com.skypro.curswork2.controller;

import com.skypro.curswork2.model.Question;
import com.skypro.curswork2.service.QuestionService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaController{
    private final  QuestionService service;

    public JavaController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("java")
   public Collection<Question> getQuestions() {
        return service.getAll();
    }

    @GetMapping("java/add")
    public Question addQuestion(@PathParam("question") String question,
                                @PathParam("answer") String answer){
        return service.add(question, answer);
    }

    @GetMapping("java/remove")
    public Question removeQuestion(@PathParam("question") String question,
                                   @PathParam("answer") String answer) {
        Question temp = new Question(question, answer);
        return service.remove(temp);
    }
}
