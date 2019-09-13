import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class Controller {

    @FXML
    private Button maxArrowLeft;
    @FXML
    private Button maxArrowRight;
    @FXML
    private Button arrowLeft;
    @FXML
    private Button arrowRight;
    @FXML
    private TextField pageDisplay;
    @FXML
    private TextField pnrField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField vornameField;
    @FXML
    private Button aenderungenVerwerfen;
    @FXML
    private Button aenderungenSpeichern;

    private ArrayList<Person> personen = new ArrayList<Person>();

    public int currentIndex = 1;

    public Controller(){
        personen.add(new Person("Herr", "Gates", "Bill"));
        personen.add(new Person("Herr", "Torvalds", "Linux"));
        personen.add(new Person("Herr", "Ballmer", "Steve"));
    }

    public void arrowLeftPressed(){
        currentIndex--;
        refreshGui();
    }

    public void arrowRightPressed(){
        currentIndex++;
        refreshGui();
    }

    public void maxArrowLeftPressed(){
        currentIndex = personen.
    }

    public void maxArrowRightPressed(){

    }

    public void aenderungenVerwerfenPressed(){

    }

    public void aenderungenSpeichernPressed(){

    }

    public void refreshGui(){

    }
}
