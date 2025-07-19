/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public class FlyweightFactory {
    private static Map<String, List> cachedData = new HashMap<>();
    
    public static <E> List<E> getData(BaseServices s, String key) throws SQLException {
        if (cachedData.containsKey(key))
            return cachedData.get(key);
        else {
            System.out.println(key + ": " + Math.random());
            List<E> r = s.list();
            cachedData.put(key, r);
            
            return r;
        }
    }
}
