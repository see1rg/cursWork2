package com.skypro.curswork2.service;

import com.skypro.curswork2.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;
@Service
public class ExaminerServiceImpl implements ExaminerService{
    Random random;
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
        return questionService.getAll();
    }
}
