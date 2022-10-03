package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MonthlyReportController {
    public AnchorPane root;
    public JFXComboBox cmbSelectMonth;
    //static ArrayList<String>combList=new ArrayList<>();

    public void initialize(){
        ObservableList<String>obList= FXCollections.observableArrayList("January",
                "February",
                "March",
                "Aprill",
                "May",
                "June",
                "Jully",
                "August",
                "September",
                "Octomber",
                "November",
                "December"

                );
        cmbSelectMonth.setItems(obList);
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"));
        Stage stage=(Stage ) this.root.getScene().getWindow();
        Scene scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
