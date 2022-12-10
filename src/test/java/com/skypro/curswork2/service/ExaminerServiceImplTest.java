package com.skypro.curswork2.service;

import com.skypro.curswork2.model.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    JavaQuestionService javaQuestionService;
    @InjectMocks
    ExaminerServiceImpl examinerService;
    private Collection<Question> actualQuestions;

    @BeforeEach
    public void setUp() {
        actualQuestions = Set.of(
                new Question("Question", "Answer"),
                new Question("Question1", "Answer1"),
                new Question("Question2", "Answer2"),
                new Question("Question3", "Answer3")
        );
        when(javaQuestionService.getAll()).thenReturn(actualQuestions);
        when(javaQuestionService.getRandomQuestion()).thenReturn(
                new Question("Question", "Answer"),
                new Question("Question1", "Answer1"),
                new Question("Question2", "Answer2"),
                new Question("Question3", "Answer3")
        );
    }

    @Test
   public void shouldReturnGetQuestions() {
        assertEquals(examinerService.getQuestions(4),actualQuestions);
    }

}