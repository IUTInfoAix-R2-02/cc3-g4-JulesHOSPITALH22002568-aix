package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {


    @FXML
    private TextField comp1;

    @FXML
    private TextField comp2;

    @FXML
    private TextField comp3;

    @FXML
    private TextField comp4;

    @FXML
    private TextField comp5;

    @FXML
    private TextField comp6;

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }
    @FXML
    private void Trace(ActionEvent event) {
        TextField noteField = new TextField();
        noteField.setOnAction(this::Comp1);
        noteField.setOnAction(this::Comp2);
        noteField.setOnAction(this::Comp3);
        noteField.setOnAction(this::Comp4);
        noteField.setOnAction(this::Comp5);
        noteField.setOnAction(this::Comp6);

        comp1.getChildrenUnmodifiable().add(noteField);
        comp2.getChildrenUnmodifiable().add(noteField);
        comp3.getChildrenUnmodifiable().add(noteField);
        comp4.getChildrenUnmodifiable().add(noteField);
        comp5.getChildrenUnmodifiable().add(noteField);
        comp6.getChildrenUnmodifiable().add(noteField);

    }

    @FXML
    private void Vide(ActionEvent event) {
        comp1.clear();
        comp2.clear();
        comp3.clear();
        comp4.clear();
        comp5.clear();
        comp6.clear();
    }

    private void Comp1(ActionEvent event) {
        Circle circle = new Circle();
        int note = Integer.parseInt(comp1.getText());
        if (note<=noteMaximale) {
            circle.setCenterX(getXRadarChart(note, 1));
            circle.setCenterY(getYRadarChart(note, 1));
        }
    }

    private void Comp2(ActionEvent event) {
        Circle circle = new Circle();
        int note = Integer.parseInt(comp2.getText());
        if (note<=noteMaximale) {
            circle.setCenterX(getXRadarChart(note, 1));
            circle.setCenterY(getYRadarChart(note, 1));
        }
    }
    private void Comp3(ActionEvent event) {
        Circle circle = new Circle();
        int note = Integer.parseInt(comp3.getText());
        if (note<=noteMaximale) {
            circle.setCenterX(getXRadarChart(note, 1));
            circle.setCenterY(getYRadarChart(note, 1));
        }
    }
    private void Comp4(ActionEvent event) {
        Circle circle = new Circle();
        int note = Integer.parseInt(comp4.getText());
        if (note<=noteMaximale) {
            circle.setCenterX(getXRadarChart(note, 1));
            circle.setCenterY(getYRadarChart(note, 1));
        }
    }
    private void Comp5(ActionEvent event) {
        Circle circle = new Circle();
        int note = Integer.parseInt(comp5.getText());
        if (note<=noteMaximale) {
            circle.setCenterX(getXRadarChart(note, 1));
            circle.setCenterY(getYRadarChart(note, 1));
        }
    }private void Comp6(ActionEvent event) {
        Circle circle = new Circle();
        int note = Integer.parseInt(comp6.getText());
        if (note<=noteMaximale) {
            circle.setCenterX(getXRadarChart(note, 1));
            circle.setCenterY(getYRadarChart(note, 1));
        }
    }



}
