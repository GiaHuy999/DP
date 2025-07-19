/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.exams;

import com.dht.pojo.Question;
import com.dht.services.questions.BaseQuestionServices;
import com.dht.services.questions.LimitQuestionDecorator;
import com.dht.utils.Configs;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author admin
 */
public class SpecificExamStrategy extends ExamStrategy{
    private int num ;

    public SpecificExamStrategy(int num) {
        this.num = num;
    }
    

    @Override
    public List<Question> getQuestions() throws SQLException {
        BaseQuestionServices base = new LimitQuestionDecorator(Configs.questionServices, num);
        return base.list();
    }
}
