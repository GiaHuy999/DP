/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.questions;

import com.dht.pojo.Category;
import java.util.List;

/**
 *
 * @author admin
 */
public class CategoryQuestionDecorator extends QuestionDecorator{
<<<<<<< HEAD
    private Category category;

    public CategoryQuestionDecorator(BaseQuestionServices decorator, Category c) {
        super(decorator);
        
        this.category = c;
=======
    private Category category; 
    
    public CategoryQuestionDecorator(BaseQuestionServices decorator, Category c) {
        super(decorator);
        this.category= c;
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
    }
    
    public CategoryQuestionDecorator(BaseQuestionServices decorator, int cateId) {
        super(decorator);
<<<<<<< HEAD
        
        this.category = new Category(cateId);
    }

    @Override
    public String getSQL(List<Object> params) {
        String sql = this.decorator.getSQL(params) + " AND category_id=?";
        params.add(this.category.getId());
        
        return sql;
    }
=======
        this.category=new Category(cateId);
    }
    

    @Override
    public String getSQL(List<Object> params) {
        String sql = this.decorator.getSQL(params)+ " AND category_id=?";
        params.add(this.category.getId());
        return sql;
    }                
    
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
}
