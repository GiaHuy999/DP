/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services;

import com.dht.pojo.Category;
import com.dht.utils.JdbcConnector;
import java.sql.Connection;
<<<<<<< HEAD
import java.sql.PreparedStatement;
=======
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
<<<<<<< HEAD
public class CategoryServices extends BaseServices<Category>{

    @Override
    public PreparedStatement getStatement(Connection conn) throws SQLException {
        return conn.prepareCall("SELECT * FROM category");
    }

    @Override
    public List<Category> getResults(ResultSet rs) throws SQLException {
=======
public class CategoryServices {

    public List<Category> getCates() throws SQLException {
        Connection conn = JdbcConnector.getInstance().connect();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM category");

>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
        List<Category> cates = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");

            Category c = new Category(id, name);
            cates.add(c);
        }

        return cates;
    }
}
