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

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class page extends Insert{

    @FXML
    private Label NameLbl;

    @FXML
    private Button quitBtn;

    @FXML
    private Button foodBtn;

    @FXML
    private Button descriptionBtn;

    @FXML
    private Button carBtn;

    @FXML
    private Button refitBtn;

    @FXML
    private Button enterBtn;

    @FXML
    private Button sportBtn;

    @FXML
    private Button clothesBtn;

    @FXML
    private Button utilitiesBtn;

    @FXML
    private Button strollerBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button otherBtn;

    @FXML
    private Label curr;

    @FXML
    private Label Bal;

    @FXML
    private TextField BalanceEditor;

    public static int s = 0;


    private int fd = 0;
    private int cr = 0;
    private int rf = 0;
    private int en = 0;
    private int sp = 0;
    private int cl = 0;
    private int ut = 0;
    private int kd = 0;
    private int hm = 0;
    private int ot = 0;

    public static ArrayList<Integer> fdValue = new ArrayList<Integer>();
    public static ArrayList<Integer> crValue = new ArrayList<Integer>();
    public static ArrayList<Integer> spValue = new ArrayList<Integer>();
    public static ArrayList<Integer> utValue = new ArrayList<Integer>();
    public static ArrayList<Integer> kdValue = new ArrayList<Integer>();
    public static ArrayList<Integer> hmValue = new ArrayList<Integer>();
    public static ArrayList<Integer> otValue = new ArrayList<Integer>();
    public static ArrayList<Integer> enValue = new ArrayList<Integer>();
    public static ArrayList<Integer> clValue = new ArrayList<Integer>();
    public static ArrayList<Integer> rfValue = new ArrayList<Integer>();



    @FXML
    private void Quit(ActionEvent event){
        Stage stage = (Stage) Bal.getScene().getWindow();
        stage.close();
        arr.clear();
    }

    @FXML
    void Clear(ActionEvent event){
        s = 0;
        Bal.setText(String.valueOf(s));
        fdValue.clear();
        spValue.clear();
        crValue.clear();
        rfValue.clear();
        enValue.clear();
        utValue.clear();
        kdValue.clear();
        hmValue.clear();
        otValue.clear();
        clValue.clear();
        fd = 0;
        cr = 0;
        rf = 0;
        en = 0;
        sp = 0;
        cl = 0;
        ut = 0;
        kd = 0;
        hm = 0;
        ot = 0;
    }
    @FXML
    void initialize(){
        String kye = String.valueOf(arr).replaceAll("\\p{P}","");
        NameLbl.setText(kye);
    }
    @FXML
    void Refit(ActionEvent event) {
        String num1 = String.valueOf(Integer.parseInt(BalanceEditor.getText()));
        s += Integer.parseInt(num1);
        Bal.setText(String.valueOf(s));
        rf += Integer.parseInt(num1);
        rfValue.add(rf);
    }

    @FXML
    void Sport(ActionEvent event) {
        String num1 = String.valueOf(Integer.parseInt(BalanceEditor.getText()));
        s += Integer.parseInt(num1);
        Bal.setText(String.valueOf(s));
        sp += Integer.parseInt(num1);
        spValue.add(sp);

    }

    @FXML
    void Utilities(ActionEvent event) {
        String num1 = String.valueOf(Integer.parseInt(BalanceEditor.getText()));
        s += Integer.parseInt(num1);
        Bal.setText(String.valueOf(s));
        ut += Integer.parseInt(num1);
        utValue.add(ut);

    }

    @FXML
    void Car(ActionEvent event) {
        String num1 = String.valueOf(Integer.parseInt(BalanceEditor.getText()));
        s += Integer.parseInt(num1);
        Bal.setText(String.valueOf(s));
        cr += Integer.parseInt(num1);
        crValue.add(cr);

    }

    @FXML
    void Clothes(ActionEvent event) {
        String num1 = String.valueOf(Integer.parseInt(BalanceEditor.getText()));
        s += Integer.parseInt(num1);
        Bal.setText(String.valueOf(s));
        cl += Integer.parseInt(num1);
        clValue.add(cl);

    }
    @FXML
    void Entertainment(ActionEvent event) {
        String num1 = String.valueOf(Integer.parseInt(BalanceEditor.getText()));
        s += Integer.parseInt(num1);
        Bal.setText(String.valueOf(s));
        en  += Integer.parseInt(num1);
        enValue.add((en));


    }
    @FXML
    void Food(ActionEvent event) {
        String num1 = String.valueOf(Integer.parseInt(BalanceEditor.getText()));
        s += Integer.parseInt(num1);
        Bal.setText(String.valueOf(s));
        fd += Integer.parseInt(num1);
        fdValue.add((fd));

    }
    @FXML
    void Home(ActionEvent event) {
        String num1 = String.valueOf(Integer.parseInt(BalanceEditor.getText()));
        s += Integer.parseInt(num1);
        Bal.setText(String.valueOf(s));
        hm += Integer.parseInt(num1);
        hmValue.add(hm);

    }
    @FXML
    void Kids(ActionEvent event) {
        String num1 = String.valueOf(Integer.parseInt(BalanceEditor.getText()));
        s += Integer.parseInt(num1);
        Bal.setText(String.valueOf(s));
        kd += Integer.parseInt(num1);
        kdValue.add((kd));

    }
    @FXML
    void Others(ActionEvent event) {
        String num1 = String.valueOf(Integer.parseInt(BalanceEditor.getText()));
        s += Integer.parseInt(num1);
        Bal.setText(String.valueOf(s));
        ot += Integer.parseInt(num1);
        otValue.add(ot);

    }
    @FXML
    void Info(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Pane layout = FXMLLoader.load(getClass().getResource("fxml/info.fxml"));
        Scene third = new Scene(layout);
        stage.setScene(third);
        stage.show();
    }
    @FXML
    void save(ActionEvent event) throws IOException {
        FileWriter writer = new FileWriter("Charges.txt", true);
        String kye = String.valueOf(arr).replaceAll("\\p{P}","");
        writer.write(kye +"'s charges is "+s+" som "+ "\n");
        s = 0;
        Bal.setText(String.valueOf(s));
        fdValue.clear();
        spValue.clear();
        crValue.clear();
        rfValue.clear();
        enValue.clear();
        utValue.clear();
        kdValue.clear();
        hmValue.clear();
        otValue.clear();
        clValue.clear();
        fd = 0;
        cr = 0;
        rf = 0;
        en = 0;
        sp = 0;
        cl = 0;
        ut = 0;
        kd = 0;
        hm = 0;
        ot = 0;
        writer.close();
    }

    @FXML
    void show(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Pane layout = FXMLLoader.load(getClass().getResource("fxml/olderInfo.fxml"));
        Scene fourth = new Scene(layout);
        stage.setScene(fourth);
        stage.show();
    }
}





