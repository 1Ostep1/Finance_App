package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


public class Insert {

    @FXML
    private TextField Name;

    @FXML
    private Button okeyBtn;

    public TextField getName() {
        return Name;

    }

    @FXML
    private Label Error;

    public static ArrayList<String> arr= new ArrayList<String>();

    @FXML
    private void okey(ActionEvent event) throws IOException {
        if (Name.getText().toString().equals("")){
            Error.setText("Write your name");
        }
        else if((Name.getText().length())<= 3){
            Error.setText("Your name should be longer");
        }
        else {
            String n = String.valueOf(Name.getText());
            arr.add(n);
            Stage stage = new Stage();
            Pane layout = FXMLLoader.load(getClass().getResource("fxml/Main.fxml"));
            Scene second = new Scene(layout);
            stage.setScene(second);
            stage.show();
        }
    }

    @FXML
    private void Quit(ActionEvent event){
        Stage stage = (Stage) Name.getScene().getWindow();
        stage.close();
        arr.clear();
    }



}
