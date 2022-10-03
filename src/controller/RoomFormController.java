package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utill.RoomSystem;

import java.io.IOException;
import java.util.ArrayList;

public class RoomFormController {
    public JFXTextField txtRoomNumber;
    public JFXTextField txtRoomType;
    public JFXTextField txtCapacity;
    public JFXTextField txtPrice;
    public TableColumn colmRoomNumber;
    public TableColumn colmType;
    public TableColumn colmCapacity;
    public TableColumn colmPrice;
    public TableColumn colmDelete;
    public TableView<RoomSystem> tblRoomDetails;
    static ArrayList<RoomSystem>roomList=new ArrayList<RoomSystem>();
    public AnchorPane roomContext;
    public TableColumn colmAvailble;

    public void initialize(){
        tblRoomDetails.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("roomNumber"));
        tblRoomDetails.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("type"));
        tblRoomDetails.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("available"));
        tblRoomDetails.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("capacity"));
        tblRoomDetails.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("price"));
        tblRoomDetails.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("available"));
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        String roomNumber=txtRoomNumber.getText();
        String roomType=txtRoomType.getText();
        String capacity=txtCapacity.getText();
        String price=txtPrice.getText();

        ObservableList<RoomSystem> rooms = tblRoomDetails.getItems();
        RoomSystem newRoom=new RoomSystem(roomNumber,roomType,"Avilable",capacity,price);
        rooms.add(newRoom);
        tblRoomDetails.refresh();
        txtRoomNumber.clear();
        txtRoomType.clear();
        txtPrice.clear();
        txtCapacity.clear();
        txtRoomNumber.requestFocus();

    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"));
        Stage stage=(Stage ) this.roomContext.getScene().getWindow();
        Scene scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
