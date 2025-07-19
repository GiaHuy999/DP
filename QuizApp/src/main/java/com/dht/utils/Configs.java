/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.utils;

import com.dht.services.CategoryServices;
import com.dht.services.LevelServices;
import com.dht.services.questions.BaseQuestionServices;
import com.dht.services.questions.QuestionServices;
import com.dht.services.questions.UpdateQuestionServices;

/**
 *
 * @author admin
 */
public class Configs {

    public static final BaseQuestionServices questionServices = new QuestionServices();
<<<<<<< HEAD
    public static final CategoryServices cateServices = new CategoryServices();
    public static final UpdateQuestionServices uQServices = new UpdateQuestionServices();
    public static final LevelServices levelServices = new LevelServices();
    
    public static final int NUM_OF_QUES =10;
    public static final double[] RATES = {0.4,0.4,0.2};
    
=======
    public static final UpdateQuestionServices UQuestionServices = new UpdateQuestionServices();
    public static final CategoryServices cateServices = new CategoryServices();
    public static final LevelServices levelServices = new LevelServices();
    
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
}
