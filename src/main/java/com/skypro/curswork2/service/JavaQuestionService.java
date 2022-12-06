package com.skypro.curswork2.service;

import com.skypro.curswork2.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;
import java.util.Set;
@Service
public class JavaQuestionService implements QuestionService{
    Set<Question> questions;
    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        return question1;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return null; // TODO: 07.12.2022  
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }

    public static int getRandom(int amount) {
        Random rand = new Random();
        return rand.nextInt(amount);
    }
}
