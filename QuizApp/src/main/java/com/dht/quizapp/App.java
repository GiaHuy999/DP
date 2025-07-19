package com.dht.quizapp;

import com.dht.utils.JdbcConnector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD
        scene = new Scene(loadFXML("exam"));
=======
        scene = new Scene(loadFXML("primary"));
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
<<<<<<< HEAD
        JdbcConnector.getInstance().close();
        super.stop(); 
    }
=======
        super.stop(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        JdbcConnector.getInstance().close();
    }
    
    
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}