package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFX_Application_02 extends Application {
Button btn;
Label lbl;
int iClickCount;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //button
         btn = new Button();
         btn.setText("Click me Quick");
         btn.setOnAction(event -> buttonClick());
         //label
        lbl = new Label();
        lbl.setText("You have not clicked the button yet!");

        //add Label and Button to the "layout pane"
        BorderPane pane = new BorderPane(); //this locations for controls like NORTH, SOUTH, Etc
        pane.setTop(lbl);
        pane.setCenter(btn);



    }


     public void buttonClick(){

     }

    public static void main(String[] args) {
        launch(args);
    }
}
