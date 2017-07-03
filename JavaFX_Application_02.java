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
        //The primaryStage   variable is passed to the start method when the launch
        // method calls the start method.

        //button
         btn = new Button();
         btn.setText("Click me Quick");
         btn.setOnAction(event -> buttonClick());   //this is a "lambda expression"

         //Lambda expressions are a new
        //feature of Java 8 that are used in situations that would’ve previously
        //required an anonymous class.
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
