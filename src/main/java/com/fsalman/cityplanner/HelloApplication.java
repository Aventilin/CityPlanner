package com.fsalman.cityplanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new VBox());
        scene.getStylesheets().add(getClass().getResource("/com/fsalman/cityplanner/css/cityplanner.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("City Planner");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}