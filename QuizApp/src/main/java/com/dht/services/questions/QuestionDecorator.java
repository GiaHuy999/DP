/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.questions;

<<<<<<< HEAD
=======
import com.dht.pojo.Question;
import java.sql.SQLException;
import java.util.List;

>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
/**
 *
 * @author admin
 */
<<<<<<< HEAD
public abstract class QuestionDecorator extends BaseQuestionServices {
    protected BaseQuestionServices decorator;

    public QuestionDecorator(BaseQuestionServices decorator) {
        this.decorator = decorator;
    }
=======
public abstract class QuestionDecorator extends BaseQuestionServices{
    protected BaseQuestionServices decorator;

    @Override
    public List<Question> list() throws SQLException {
        return super.list(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    public QuestionDecorator(BaseQuestionServices decorator) {
        this.decorator = decorator;
    }

    
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
}
