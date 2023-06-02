package fr.amu.iut.cc3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ToileApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("toile.fxml"));
        primaryStage.setResizable(false);
        root.setStyle("-fx-background-color:#bcd0fb;");
        Scene scene = new Scene(root, 875, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Résultats aux différentes compétences du BUT");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}

