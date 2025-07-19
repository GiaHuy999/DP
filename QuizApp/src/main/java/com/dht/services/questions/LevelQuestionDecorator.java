/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.questions;

import com.dht.pojo.Level;
import java.util.List;

/**
 *
 * @author admin
 */
public class LevelQuestionDecorator extends QuestionDecorator {
<<<<<<< HEAD
    private Level level;

    public LevelQuestionDecorator(BaseQuestionServices decorator, Level lvl) {
        super(decorator);
        this.level = lvl;
    }
    
    public LevelQuestionDecorator(BaseQuestionServices decorator, int lvlId) {
        super(decorator);
        this.level = new Level(lvlId);
=======

    private Level level;

    public LevelQuestionDecorator(BaseQuestionServices decorator, Level v) {
        super(decorator);
        this.level = v;
    }

    public LevelQuestionDecorator(BaseQuestionServices decorator, int id) {
        super(decorator);
        this.level = new Level(id);
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
    }

    @Override
    public String getSQL(List<Object> params) {
        String sql = this.decorator.getSQL(params) + " AND level_id=?";
        params.add(this.level.getId());
<<<<<<< HEAD
        
=======
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
        return sql;
    }
    
}
