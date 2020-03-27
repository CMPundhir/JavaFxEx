package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;

public class BoroughController {
    @FXML
    Button b1,b2,b3;

    public void setOnMouseEntered2(MouseEvent evt){
        System.out.print(((Control)evt.getSource()).getId());
        DropShadow drop = new DropShadow();
        ((Control)evt.getSource()).setEffect(drop);
        ((Control)evt.getSource()).setStyle("-fx-background-color:LightGreen;");
    }

    public void setOnMouseExited2(MouseEvent evt){
        ((Control)evt.getSource()).setStyle("-fx-background-color:White;");
        ((Control)evt.getSource()).setEffect(null);
    }

    public void setOnMousePressed(MouseEvent evt){
        ((Control)evt.getSource()).setStyle("-fx-background-color:White;");
        ((Control)evt.getSource()).setEffect(new InnerShadow());
    }

    public void setOnMouseReleased(MouseEvent evt){
        ((Control)evt.getSource()).setStyle("-fx-background-color:Yellow;");
        ((Control)evt.getSource()).setEffect(new DropShadow());
    }
}
