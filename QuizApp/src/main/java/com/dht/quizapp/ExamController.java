/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dht.quizapp;

import com.dht.pojo.Question;
import com.dht.services.exams.ExamStrategy;
import com.dht.services.exams.ExamTypes;
import com.dht.services.exams.FixedExamStrategy;
import com.dht.services.exams.SpecificExamStrategy;
import com.dht.utils.MyAlert;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class ExamController implements Initializable {

    @FXML
    private ComboBox<ExamTypes> cbExamType;
    @FXML
    private TextField txtNum;
    @FXML
    private ListView<Question> lvQuestion;

    List<Question> questions = new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbExamType.setItems(FXCollections.observableArrayList(ExamTypes.values()));
        this.txtNum.setVisible(false);
        this.cbExamType.getSelectionModel().selectedItemProperty().addListener((e -> {
            if (this.cbExamType.getSelectionModel().getSelectedItem() == ExamTypes.SPECIFIC) {
                this.txtNum.setVisible(true);
            } else {
                this.txtNum.setVisible(false);
            }
        }));
    }

    public void handleStart(ActionEvent event) throws SQLException {
        ExamStrategy e = new FixedExamStrategy();
        if (this.cbExamType.getSelectionModel().getSelectedItem() == ExamTypes.SPECIFIC) {
            e = new SpecificExamStrategy(Integer.parseInt(txtNum.getText()));
        }
        this.questions = e.getQuestions();
        this.lvQuestion.setItems(FXCollections.observableArrayList(this.questions));
    }

    public void handleDone(ActionEvent event) {
    }

    public void handleSave(ActionEvent event) {
    }

}
