package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.xml.stream.util.StreamReaderDelegate;

public class Controller {
    @FXML
    public TextField output;
    @FXML
    public TextField a;
    @FXML
    public TextField b;

    @FXML
    public void calcObject(){
        Rectangle rect = new Rectangle(Double.parseDouble(a.getText()), Double.parseDouble(b.getText()));
        output.setText(Double.toString(rect.getArea()));

    }

    @FXML
    public void calcStatic(){
        output.setText(Double.toString(Rectangle.rectangleStatic(Double.parseDouble(a.getText()), Double.parseDouble(b.getText()))));



    }
}
