/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.questions;

import com.dht.pojo.Question;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author admin
 */
public class LimitQuestionDecorator extends QuestionDecorator {
    private int num;

    public LimitQuestionDecorator(BaseQuestionServices decorator, int num) {
        super(decorator);
        
        this.num = num;
    }

    @Override
    public String getSQL(List<Object> params) {
        String sql = this.decorator.getSQL(params) + " ORDER BY rand() LIMIT ?";
        params.add(this.num);
        return sql;
    }

    @Override
    public List<Question> list() throws SQLException {
        List<Question> questions = super.list(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        for (var q: questions) {
            q.setChoices(this.getChoicesByQuestionId(q.getId()));
        }
        
        return questions;
    }
    
    
}
