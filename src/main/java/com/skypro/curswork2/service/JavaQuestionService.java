package com.skypro.curswork2.service;

import com.skypro.curswork2.exception.QuestionNotFoundException;
import com.skypro.curswork2.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        return add(new Question(question, answer));
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (!questions.contains(question)) {
            throw new QuestionNotFoundException("Нет такого вопроса.");
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
        List<Question> list = new ArrayList<>(questions);
        int rand = new Random().nextInt(questions.size());
        return list.get(rand);
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
