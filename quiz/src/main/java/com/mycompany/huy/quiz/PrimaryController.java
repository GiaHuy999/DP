package com.mycompany.huy.quiz;

import javafx.event.ActionEvent;



public class PrimaryController {
    public void handleQM(ActionEvent event){
        MyAlert.getInstance().showMsg("Xin chao");
    }
    public void handlePra(ActionEvent event){
        MyAlert.getInstance().showMsg("Xin chao, thi nhe");
    }
    
}
