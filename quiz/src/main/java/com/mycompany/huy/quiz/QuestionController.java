/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.huy.quiz;

import com.mycompany.huy.pojo.Category;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
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
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cales", "root", "root");
            
            //B3 xu ly truy van
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM caterogy");
            
            List<Category> cates = new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                                                 
                //System.err.printf("%d - %s\n",id,name);
                Category c = new Category(id,name);
                cates.add(c);
            }
            //B4 Dong ket noi
            conn.close();
            
            this.cbCates.setItems(FXCollections.observableList(cates));
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
    }    
    
}
