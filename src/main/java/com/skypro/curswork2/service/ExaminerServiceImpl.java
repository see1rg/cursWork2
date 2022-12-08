package com.skypro.curswork2.service;

import com.skypro.curswork2.exception.IncorrectNumberOfQuestions;
import com.skypro.curswork2.model.Question;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService{
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size() || amount <=0) {
            throw new IncorrectNumberOfQuestions("не корректное количество вопросов");
        }
        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount){
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}

