/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.questions;

<<<<<<< HEAD
import com.dht.pojo.Choice;
=======
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
import com.dht.pojo.Question;
import com.dht.utils.JdbcConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
<<<<<<< HEAD
=======
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606

/**
 *
 * @author admin
 */
<<<<<<< HEAD
public class UpdateQuestionServices {

    public void addQuestion(Question q) throws SQLException {
        Connection conn = JdbcConnector.getInstance().connect();
=======
public class UpdateQuestionServices{

    public void addQuestion(Question q) throws SQLException {
        Connection conn = JdbcConnector.getInstance().connect();
        
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
        conn.setAutoCommit(false);
        String sql = "INSERT INTO question(content, hint, image, category_id, level_id) VALUES(?, ?, ?, ?, ?)";
        PreparedStatement stm = conn.prepareCall(sql);
        stm.setString(1, q.getContent());
        stm.setString(2, q.getHint());
        stm.setString(3, q.getImage());
        stm.setInt(4, q.getCategory().getId());
        stm.setInt(5, q.getLevel().getId());
<<<<<<< HEAD
        if (stm.executeUpdate() > 0) {
            int qId = -1;
            ResultSet r = stm.getGeneratedKeys();
            if (r.next()) {
                qId = r.getInt(1);
            }
            sql = "INSERT INTO choice(content, is_correct, question_id) VALUES(?, ?, ?)";
            for (Choice c : q.getChoices()) {
=======
        
        if (stm.executeUpdate() > 0) {
            int qId = -1;
            ResultSet r = stm.getGeneratedKeys();
            if (r.next())
                qId = r.getInt(1);
            
            sql = "INSERT INTO choice(content, is_correct, question_id) VALUES(?, ?, ?)";
            
            for (var c: q.getChoices()) {
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
                stm = conn.prepareCall(sql);
                stm.setString(1, c.getContent());
                stm.setBoolean(2, c.isCorrect());
                stm.setInt(3, qId);
<<<<<<< HEAD
                stm.executeUpdate();
            }
            conn.commit();
        } else {
            conn.rollback();
        }
    }

    public boolean deleteQuestion(int questionId) throws SQLException {
        Connection conn = JdbcConnector.getInstance().connect();
        PreparedStatement stm = conn.prepareCall("DELETE FROM question WHERE id=?");
        stm.setInt(1, questionId);
        return stm.executeUpdate() > 0;
    }
    
=======
                
                stm.executeUpdate();
            }
            
            conn.commit();
        } else
            conn.rollback();
    }
    
    
    public boolean deleteQuestion(int questionId) throws SQLException {
        Connection conn = JdbcConnector.getInstance().connect();
        
        PreparedStatement stm = conn.prepareCall("DELETE FROM question WHERE id=?");
        stm.setInt(1, questionId);
        
        return stm.executeUpdate() > 0;
    }

    
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
}
