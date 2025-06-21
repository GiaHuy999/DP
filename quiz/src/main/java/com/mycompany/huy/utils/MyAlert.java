/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.huy.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlert {

    private static MyAlert instace;
    private final Alert alert;
    
    private MyAlert() {
        this.alert = new Alert(Alert.AlertType.INFORMATION);
        this.alert.setTitle("Quizz App");
        this.alert .setHeaderText("Quizz App");
    }

    public static MyAlert getInstance() {
        if (instace == null) {
            instace = new MyAlert();
        }
        return instace;
    }
    public void showMsg(String msg){
        this.alert.setContentText(msg);
        this.alert.showAndWait();
    }

}
