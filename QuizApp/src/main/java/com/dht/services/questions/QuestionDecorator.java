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
public abstract class QuestionDecorator extends BaseQuestionServices{
    protected BaseQuestionServices decorator;

    @Override
    public List<Question> list() throws SQLException {
        return super.list(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    public QuestionDecorator(BaseQuestionServices decorator) {
        this.decorator = decorator;
    }

    
}
