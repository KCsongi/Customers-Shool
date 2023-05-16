package com.csongi.otthoni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class App extends Application {

    private static Scene scene;

    
    
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("otthonTablazat"), 640, 480);
        stage.setScene(scene);
        stage.setTitle("Táblázat App");
        stage.setMinWidth(400);
        stage.setMinHeight(300);
        stage.show();
    }

   
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    
    

}