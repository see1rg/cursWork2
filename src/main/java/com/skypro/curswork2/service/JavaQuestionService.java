package com.skypro.curswork2.service;

import com.skypro.curswork2.exception.QuestionNotFoundException;
import com.skypro.curswork2.exception.RepeatQuestionException;
import com.skypro.curswork2.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService{
    Set<Question> questions = new HashSet<>();
    Random random = new Random();
    @Override
    public Question add(String question, String answer) {
        return add(new Question(question, answer));
    }

    @Override
    public Question add(Question question) {
       if (questions.contains(question)){
            throw new RepeatQuestionException("Такой вопрос уже есть в списке.");
        }
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
       if (!questions.contains(question)){
           throw new QuestionNotFoundException("Не найдено такого вопроса.");
       }
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
      return new ArrayList<>(questions).get(random.nextInt(questions.size()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JavaQuestionService that)) return false;

        return questions.equals(that.questions);
    }

    @Override
    public int hashCode() {
        return questions.hashCode();
    }
}
