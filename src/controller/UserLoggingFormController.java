package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utill.CheckAdmit;

import java.io.IOException;

public class UserLoggingFormController {
    public JFXTextField txtName;
    public JFXPasswordField txtPasssword;
    public AnchorPane userLogingFormContext;

    public void okOnAction(ActionEvent actionEvent) throws IOException {
        CheckAdmit ch=new CheckAdmit(txtName.getText(),txtPasssword.getText());

        if (ch.check()){
            //String form=ch.get();
            Parent parent= FXMLLoader.load(getClass().getResource("../view/UserForm.fxml"));
            Scene scene=new Scene(parent);
            Stage primaryStage=(Stage ) this.userLogingFormContext.getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.show();
        }else{
            new Alert(Alert.AlertType.WARNING,"Your user name password are not valid", ButtonType.CLOSE).show();
        }

    }

    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("../view/DashBordForm.fxml"));
        Scene scene=new Scene(parent);
        Stage primaryStage=(Stage ) this.userLogingFormContext.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
