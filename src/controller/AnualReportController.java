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

public class AnualReportController {
    public AnchorPane root;
    public JFXComboBox cmbSelectYear;

    public void initialize(){
        ObservableList<String>obList= FXCollections.observableArrayList("1980",
                "1981",
                "1982",
                "1983",
                "1984",
                "1985",
                "1986",
                "1987",
                "1988",
                "1989",
                "1990",
                "1991"
                );
        cmbSelectYear.setItems(obList);
    }
    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"));
        Stage stage=(Stage ) this.root.getScene().getWindow();
        Scene scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
