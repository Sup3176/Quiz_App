package com.sup.quiz.app.service;

import com.sup.quizapp.dao.Question;
import com.sup.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {

        return questionDao.findAll();
    }
}

