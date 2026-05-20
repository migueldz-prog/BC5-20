
package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button button = new Button("Mostrar alerta");//creamos el boton y le damos accion

        button.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alerta");//titulamos la alerta
            alert.setHeaderText("¡La que estas liando!");
            alert.setContentText("Apaga y a casa");//le ponemos el contenido
            alert.showAndWait();
        });

        VBox vbox = new VBox(10, button);//colocamos con vbox

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Ejer 20 - Alerta");
        primaryStage.setScene(scene);
        primaryStage.show();//creo la escena, la titulo, le asigno la ventana y doy visibilidad
    }

    public static void main(String[] args) {
        launch(args); //metodo de aplication para arrancar el programa
    }
}