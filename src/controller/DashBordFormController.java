package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBordFormController {
    public AnchorPane root;

    public void click(String form) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("../view/"+form+".fxml"));
        Scene scene=new Scene(parent);
        Stage primaryStage=(Stage ) this.root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void btnAdminForm(ActionEvent actionEvent) throws IOException {
        click("AdminLoggingForm");
    }

    public void btnUserForm(ActionEvent actionEvent) throws IOException {
        click("UserLoggingForm");
    }
}
