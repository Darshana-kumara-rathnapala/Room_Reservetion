package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserFormController {


    public AnchorPane userFormContext;

    public void btnRomMaintenceOnAction(ActionEvent actionEvent) {
    }

    public void btnReserveRoomOnAcion(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("../view/ReserveRoomForm.fxml"));
        Stage stage=(Stage ) this.userFormContext.getScene().getWindow();
        Scene scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void btnLogoutOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("../view/DashBordForm.fxml"));
        Stage stage=(Stage ) this.userFormContext.getScene().getWindow();
        Scene scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
