package Lab_17_15;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Lab_17 {
    @FXML
    TextField text= new TextField();

    public void plus(ActionEvent actionEvent) {
        text.setEditable(false);
        if (Integer.parseInt(text.getText())<3)
        text.setText(String.valueOf(Integer.parseInt(text.getText())+1));
    }

    public void minus(ActionEvent actionEvent) {
        if (Integer.parseInt(text.getText())>-5)
        text.setText(String.valueOf(Integer.parseInt(text.getText())-1));
    }
}