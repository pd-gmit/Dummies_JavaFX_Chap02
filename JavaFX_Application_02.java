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

        //A Lambda expression is a concise way to create an anonymous class that
        //implements a functional interface. Instead of providing a formal method declaration
        // that includes the return type, method name, parameter types, and
        // method body, you simply define the parameter types and the method body.
        // The Java compiler infers the rest based on the context in which you use the
        // Lambda expression.  [ref Java FX for Dummies]

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
