/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.utils.theme;

<<<<<<< HEAD
=======
import com.dht.quizapp.App;
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606
import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public class ThemeManager {
<<<<<<< HEAD
    private static ThemeFactory themeFactory = new DefaultThemeFactory();
=======
    private static ThemeFactory themeFactory = new DarkThemeFactory();
>>>>>>> c15c49f61d9e1cd32054017a3b307ef0efbb7606

    /**
     * @param aThemeFactory the themeFactory to set
     */
    public static void setThemeFactory(ThemeFactory aThemeFactory) {
        themeFactory = aThemeFactory;
    }
    
    public static void applyTheme(Scene scene) {
        scene.getRoot().getStylesheets().clear();
        scene.getRoot().getStylesheets().add(themeFactory.getStyleSheet());
    }
}
