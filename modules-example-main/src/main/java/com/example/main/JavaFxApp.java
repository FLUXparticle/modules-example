package com.example.main;

import com.example.direct.*;
import com.example.indirect.*;
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class JavaFxApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);

        Label label1 = new Label("Direct Message:");
        Label label2 = new Label("Indirect Message:");
        Label label3 = new Label("Reflection Message:");

        String message1 = DirectMessage.getMessage();
        String message2 = IndirectMessage.getMessage();
        String message3 = Class.forName("com.example.reflection.ReflectionMessage")
                .getMethod("getMessage")
                .invoke(null)
                .toString();

        gridPane.add(label1, 0, 0);
        gridPane.add(new Label(message1), 1, 0);

        gridPane.add(label2, 0, 1);
        gridPane.add(new Label(message2), 1, 1);

        gridPane.add(label3, 0, 2);
        gridPane.add(new Label(message3), 1, 2);

        stage.setScene(new Scene(gridPane, 800, 600));
        stage.setTitle("Modules Example");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(JavaFxApp.class, args);
    }

}
