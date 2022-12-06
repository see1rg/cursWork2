package com.skypro.curswork2.service;

import com.skypro.curswork2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
