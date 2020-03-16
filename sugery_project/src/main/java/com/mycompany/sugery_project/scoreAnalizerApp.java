/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 *
 * @author mikowhy
 */
public class scoreAnalizerApp extends Application {
    User usr;

    public scoreAnalizerApp(User user){
        this.usr = user;
    }
    
    
    public void start(Stage stage){
        String[] test = new String[10];
        stage.setTitle("Miko's Graph");
        stage.show();
    }

    public static void main(String args){
        Application.launch(args);
    }
    
}