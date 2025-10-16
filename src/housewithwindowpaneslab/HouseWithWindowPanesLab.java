/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package housewithwindowpaneslab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author david hernandez
 */
public class HouseWithWindowPanesLab extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * main application and logic running
     * @param stage stage of application
     */
    @Override
    public void start(Stage stage) {
        // make a style ground
        Rectangle ground = new Rectangle(0, 700, 800, 100);
        ground.setFill(Color.GREEN);
        
        // make and style body of house
        Rectangle house = new Rectangle(200, 400, 400, 300);
        house.setStroke(Color.BLACK);
        house.setFill(Color.LIGHTGREY);
        
        // make and style roof of house
        Polygon roof = new Polygon(200, 400, 600, 400, 400, 250);
        roof.setFill(Color.RED);
        
        // make and style door
        Rectangle door = new Rectangle(400, 580, 60, 120);
        door.setFill(Color.FIREBRICK);
        
        // make and style left window
        Rectangle window1 = new Rectangle(240, 480, 90, 90);
        window1.setFill(Color.LIGHTBLUE);
        
        // make and style right window
        Rectangle window2 = new Rectangle(480, 480, 90, 90);
        window2.setFill(Color.LIGHTBLUE);
        
        // make windowpanes on windows 
        Line line1 = new Line(285, 480, 285, 570);
        Line line2 = new Line(240, 525, 330, 525);
        Line line3 = new Line(525, 480, 525, 570);
        Line line4 = new Line(480, 525, 570, 525);
        
        // make and style chimney
        Rectangle chimney = new Rectangle(350, 260, 30, 90);
        chimney.setFill(Color.DARKSLATEGREY);
        
        // make and style step under house
        Rectangle step = new Rectangle(200, 700, 400, 20);
        step.setFill(Color.BEIGE);
        
        // make and style sun
        Circle sun = new Circle(650, 100, 70);
        sun.setFill(Color.YELLOW);
        
        // make and style 4 sun rays
        Line ray1 = new Line(650, 100, 580, 170);
        Line ray2 = new Line(650, 100, 720, 170);
        Line ray3 = new Line(650, 100, 580, 30);
        Line ray4 = new Line(650, 100, 720, 30);
        ray1.setStroke(Color.YELLOW);
        ray2.setStroke(Color.YELLOW);
        ray3.setStroke(Color.YELLOW);
        ray4.setStroke(Color.YELLOW);
        
        // make pane and add shapes to it
        Pane root = new Pane();
        root.getChildren().add(ground);
        root.getChildren().add(house);
        root.getChildren().add(roof);
        root.getChildren().add(door);
        root.getChildren().add(window1);
        root.getChildren().add(window2);
        root.getChildren().add(line1);
        root.getChildren().add(line2);
        root.getChildren().add(line3);
        root.getChildren().add(line4);
        root.getChildren().add(chimney);
        root.getChildren().add(step);
        root.getChildren().add(sun);
        root.getChildren().add(ray1);
        root.getChildren().add(ray2);
        root.getChildren().add(ray3);
        root.getChildren().add(ray4);
        
        // initialize scene and show stage
        Scene scene = new Scene(root, 800, 800);
        stage.setTitle("House with Window Panes");
        stage.setScene(scene);
        stage.show();
    }
    
}
