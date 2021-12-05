package com.example.music;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;


public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        // primaryStage.setTitle("Hello World")
        primaryStage.setScene(new Scene(root,654,222));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}