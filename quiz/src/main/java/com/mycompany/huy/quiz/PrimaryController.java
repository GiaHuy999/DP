package com.mycompany.huy.quiz;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class PrimaryController {
    public void handleQM(ActionEvent event) throws IOException{
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("question.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("quizz app");
        stage.show();
    }
    public void handlePra(ActionEvent event){
        MyAlert.getInstance().showMsg("Xin chao, thi nhe");
    }
    
}
