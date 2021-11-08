/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Antonia Jimenez
 */
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;

public class TodoListApplication extends javafx.application.Application{
    public static ArrayList <Item> myList;


    public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage stage) throws Exception {
            URL url = getClass().getClassLoader().getResource("ToDoApp.fxml");
            Parent root = FXMLLoader.load(url);
            Scene scene = new Scene(root);


            stage.setTitle("To Do App");
            stage.setScene(scene);
            stage.show();
        }
}
