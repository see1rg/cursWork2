package com.skypro.curswork2.controller;

import com.skypro.curswork2.model.Question;
import com.skypro.curswork2.service.QuestionService;

import java.util.Collection;

public class JavaController{
    private final  QuestionService questionService;

    public JavaController(QuestionService questionService) {
        this.questionService = questionService;
    }

    Collection<Question> getQuestion() {

    }


    Question removeQuestion(String question, String answer) {

    }
}
