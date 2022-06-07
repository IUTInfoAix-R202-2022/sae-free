package client1;

import java.io.IOException;
import java.lang.*;

import fr.univ_amu.iut.view.map.AcademiePath;
import fr.univ_amu.iut.view.map.France;
import fr.univ_amu.iut.view.map.FranceBuilder;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class
application extends Application {

    public static void main(String[]args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{

            primaryStage.setTitle("Application DNE");
            primaryStage.setResizable(true);
            Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }

    public void buttonClickedReturn(ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("application.fxml"));
        Scene scene = new Scene(loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.setResizable(false);
        app_stage.show();
    }

    public void buttonclickedReseaux (ActionEvent event) throws IOException {

        AnchorPane loader = FXMLLoader.load(getClass().getResource("réseaux.fxml"));
        Scene scene = new Scene(loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setFullScreen(true);
        France france = FranceBuilder.create()
                .backgroundColor(Color.web("#1d3557"))
                //.fillColor(Color.web("#dcb36c"))
                //.strokeColor(Color.web("#987028"))
                //.hoverColor(Color.web("#fec47e"))
                //.pressedColor(Color.web("#6cee85"))
                //.selectedColor(Color.MAGENTA)
                .mousePressHandler(evt -> {
                    AcademiePath academiePath = (AcademiePath) evt.getSource();
                    System.out.println("On vient de cliquer sur l'" + academiePath.getAcademie().getNom());
                })
                .selectionEnabled(true)
                .build();

        france.setLayoutX(-70);
        france.setLayoutY(-85);
        app_stage.setScene(scene);
        loader.getChildren().add(france);
        app_stage.show();
    }


    public void buttonClickedFormulaire (ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("Formulaire.fxml"));
        Scene scene = new Scene(loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.setResizable(false);
        app_stage.show();
    }


    public void buttonclickedSearch (ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("JPA.fxml"));
        Scene scene = new Scene(loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.setResizable(false);
        app_stage.show();
    }
}






