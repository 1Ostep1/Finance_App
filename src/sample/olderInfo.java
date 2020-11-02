package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class olderInfo {

    @FXML
    private Label olderLbl;

    @FXML
    void olderInfo(ActionEvent event) throws IOException {

        try(FileReader reader = new FileReader("Charges.txt"))
        {
            char[] buf = new char[2048];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 2048){
                    buf = Arrays.copyOf(buf, c);
                }
                olderLbl.setText(String.valueOf(buf));
                reader.close(); }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    @FXML
    void Quit(ActionEvent event){
        Stage stage = (Stage) olderLbl.getScene().getWindow();
        stage.close();
    }
    @FXML
    void Erase(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Pane layout = FXMLLoader.load(getClass().getResource("fxml/Sure.fxml"));
        Scene fourth = new Scene(layout);
        stage.setScene(fourth);
        stage.show();
    }
}
