package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Sure {

    @FXML
    private Label Error;

    @FXML
    void Cancel(ActionEvent event) {
        Stage stage = (Stage) Error.getScene().getWindow();
        stage.close();
    }

    @FXML
    void Yes(ActionEvent event) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("Charges.txt");
        pw.print("");
        pw.close();
        Stage stage = (Stage) Error.getScene().getWindow();
        stage.close();
    }

}
