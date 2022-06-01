package client1;

import java.io.IOException;
import java.lang.*;
import fr.univ_amu.iut.FranceMain;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;




public class application extends Application {

    public static void main(String[]args){
        launch(args);
    }


    public void start(Stage primaryStage) throws Exception{

            primaryStage.setTitle("Application DNE");
            primaryStage.setResizable(false);
            Parent root = FXMLLoader.load(getClass().getResource("application.fxml"));
            primaryStage.setScene(new Scene(root, 600,400));
            primaryStage.show();
        }

    public void buttonclicked (ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("besoinAide.fxml"));
        Scene scene = new Scene(loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.setResizable(false);
        app_stage.show();
    }

    public void buttonClickedFormulaire (ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("formulaire.fxml"));
        Scene scene = new Scene(loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.setResizable(false);
        app_stage.show();
    }

    public void buttonClickedReturn (ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("application.fxml"));
        Scene scene = new Scene(loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.setResizable(false);
        app_stage.show();
    }

    }


