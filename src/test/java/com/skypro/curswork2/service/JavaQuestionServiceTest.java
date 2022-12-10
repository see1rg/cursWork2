package com.skypro.curswork2.service;

import com.skypro.curswork2.exception.QuestionNotFoundException;
import com.skypro.curswork2.exception.RepeatQuestionException;
import com.skypro.curswork2.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {

    private static final String QUESTION = "QUESTION";
    private static final String ANSWER = "ANSWER";
    private final QuestionService questionService = new JavaQuestionService();

    public static final Question TEST = new Question(QUESTION,ANSWER);

    @Test
    public void addTest() {
        assertEquals(TEST, questionService.add("QUESTION", "ANSWER"));
        assertThat(questionService.getAll()).contains(TEST);
    }


    @Test
    public void remove() {
        questionService.add(TEST);
        assertEquals(TEST, questionService.remove(TEST));
    }

    @Test
    public void removeTestException() {
        assertThrows(QuestionNotFoundException.class, () -> {
            questionService.remove(TEST);
        });
    }

    @Test
    public void getAllEmptyTest() {
        assertTrue(questionService.getAll().isEmpty());
    }

    @Test
    public void getAllTest() {
        questionService.add(TEST);
        assertTrue(questionService.getAll().contains(TEST));
    }

    @Test
    public void getRandomQuestionTest() {
        questionService.add(TEST);
        assertEquals(TEST, questionService.getRandomQuestion());
    }
}