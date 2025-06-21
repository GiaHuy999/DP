/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.huy.quiz;

import com.mycompany.huy.pojo.Category;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionController implements Initializable {

    @FXML private ComboBox<Category> cbCates;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // B1 nap driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //B2 Mo ket noi
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "root");
            
            //B3 xu ly truy van
            Statement stm = conn.createStatement();
            stm.executeQuery("SELECT * FROM");
            
            //B4 Dong ket noi
            conn.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
    }    
    
}
