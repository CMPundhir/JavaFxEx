package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button b1,b2,b3;


    public void setOnMouseEntered2(MouseEvent t){
       // b1.setStyle("-fx-background-color:#dae7f3;-fx-border-width:5px;");
        //b1.setText("bkjdbk");
    }

    public void setOnMouseExited2(MouseEvent t){
        //b1.setStyle("-fx-background-color:White;");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DropShadow drop = new DropShadow();
        b1.setEffect(drop);
    }
}
