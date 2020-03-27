package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyShapes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Rectangle Example");
        Group group = new Group(); //creating Group
        Rectangle rect=new Rectangle(); //instantiating Rectangle
        rect.setX(20); //setting the X coordinate of upper left //corner of rectangle
        rect.setY(20); //setting the Y coordinate of upper left //corner of rectangle
        rect.setWidth(100); //setting the width of rectangle
        rect.setHeight(100); // setting the height of rectangle

        Button button = new Button("click me");
        button.setEffect(new DropShadow());
        //button.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/hexa2.png"))));
       // button.setText("");
        button.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                button.setStyle("-fx-background-color:#dae7f3;");
            }
        });

        button.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                button.setStyle("-fx-background-color:transparent;");
            }
        });

        group.getChildren().addAll(rect); //adding rectangle to the //group
        group.getChildren().addAll(button); //adding rectangle to the //group

        Scene scene = new Scene(group,200,300, Color.WHEAT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
