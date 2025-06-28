package com.dht.quizapp;

import com.dht.utils.MyAlert;
import com.dht.utils.MyStage;
import com.dht.utils.theme.Theme;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;


public class PrimaryController implements Initializable{
    
    @FXML private ComboBox<Theme> cbThmes;


    public void changeTheme(ActionEvent event){
        this.cbThmes.getSelectionModel().getSelectedItem().updateTheme(this.cbThmes.getScene());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThmes.setItems(FXCollections.observableArrayList(Theme.values()));
    }
    
    
    public void handleQuestionManagement(ActionEvent event) throws IOException {
           MyStage.getInstance().showStage("questions.fxml");
//        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
//        
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Quiz App");
//        stage.show();
    }
    
    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Comming soon...");
    }
    
    public void handleExam(ActionEvent event) {
        MyAlert.getInstance().showMsg("Comming soon...");
    }
    
    public void handleRegister(ActionEvent event) {
        MyAlert.getInstance().showMsg("Comming soon...");
    }
    
    public void handleLogin(ActionEvent event) {
        MyAlert.getInstance().showMsg("Comming soon...");
    }
}
