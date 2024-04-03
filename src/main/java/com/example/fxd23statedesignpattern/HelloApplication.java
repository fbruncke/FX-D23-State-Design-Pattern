package com.example.fxd23statedesignpattern;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //
        // XMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Pane p = new Pane();

        CoffeeMachine cm = new CoffeeMachine();

        Button btnGetCoffee = new Button("Get coffee");
        btnGetCoffee.setLayoutY(100);
        btnGetCoffee.setLayoutX(100);
        btnGetCoffee.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 System.out.println("before: "+cm.getCms().getStateAsString());
                 cm.setPayment(cm.getPayment()+1);
                 cm.useCoffeeMachine();
                 System.out.println("After: " + cm.getCms().getStateAsString());
             }
         }
        );

        p.getChildren().addAll(btnGetCoffee);

        Scene scene = new Scene(p, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}