package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Collections;

import static sample.page.*;


public class Info {
    @FXML
    private Button infoOk;

    @FXML
    private Button ShowBtn;

    @FXML
    private Label dateL;

    @FXML
    private Label nameL8;

    @FXML
    private Label FoodV;

    @FXML
    private Label CarV;

    @FXML
    private Label RefitV;

    @FXML
    private Label EntertainmentV;

    @FXML
    private Label SportV;

    @FXML
    private Label ClothesV;

    @FXML
    private Label UtilitiesV;

    @FXML
    private Label KidsV;

    @FXML
    private Label HomeV;

    @FXML
    private Label OthersV;

    @FXML
    private Label SumLbl;

    @FXML
    void infoOk(ActionEvent event) {

        Stage stage = (Stage) infoOk.getScene().getWindow();
        stage.close();
    }

    @FXML
    void Show(ActionEvent event) {

        SumLbl.setText(String.valueOf(s));

        if (spValue.isEmpty()){
        }else {Integer val = Collections.max(spValue);
    SportV.setText(String.valueOf(val));}

        if (crValue.isEmpty()){
        }else {Integer val1 = Collections.max(crValue);
    CarV.setText(String.valueOf(val1));}

        if (fdValue.isEmpty()){
        }else {Integer val2 = Collections.max(fdValue);
    FoodV.setText(String.valueOf(val2));}

        if (kdValue.isEmpty()){
        }else {Integer val3 = Collections.max(kdValue);
    KidsV.setText(String.valueOf(val3));}

        if (utValue.isEmpty()){
        }else {Integer val4 = Collections.max(utValue);
    UtilitiesV.setText(String.valueOf(val4));}

        if (enValue.isEmpty()){
        }else { Integer val5 = Collections.max(enValue);
    EntertainmentV.setText(String.valueOf(val5));}

        if (otValue.isEmpty()){
        }else {Integer val6 = Collections.max(otValue);
    OthersV.setText(String.valueOf(val6));}

        if (rfValue.isEmpty()){
        }else {Integer val7 = Collections.max(rfValue);
    RefitV.setText(String.valueOf(val7));}

        if (hmValue.isEmpty()){
        }else {Integer val8 = Collections.max(hmValue);
    HomeV.setText(String.valueOf(val8));}

        if (clValue.isEmpty()){
        }else {Integer val9 = Collections.max(clValue);
    ClothesV.setText(String.valueOf(val9));}
    }
}