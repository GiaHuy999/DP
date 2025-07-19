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
    private Category category;

    public CategoryQuestionDecorator(BaseQuestionServices decorator, Category c) {
        super(decorator);
        
        this.category = c;
    }
    
    public CategoryQuestionDecorator(BaseQuestionServices decorator, int cateId) {
        super(decorator);
        
        this.category = new Category(cateId);
    }

    @Override
    public String getSQL(List<Object> params) {
        String sql = this.decorator.getSQL(params) + " AND category_id=?";
        params.add(this.category.getId());
        
        return sql;
    }
}
