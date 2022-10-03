package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
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
import utill.RoomBook;
import utill.RoomSystem;

import java.io.IOException;
import java.util.ArrayList;

public class ReserveRoomFormController {
    public TableView<RoomSystem> tblRoomDetail;
    public JFXButton btnBackOnAction;
    public TableView <RoomBook>tblBooked;
    public JFXTextField txtId;
    public JFXTextField txtName;
    public JFXTextField txtContact;
    public JFXTextField txtMeal;
    public JFXTextField txtEmail;
    public JFXTextField txtPrice;
    public JFXTextField txtRoomNumber;
    public JFXTextField txtFromTo;
    public AnchorPane root;
    static ArrayList<RoomBook>roombook=new ArrayList<RoomBook>();
    public JFXButton btnBackOnAction1;
    public TableColumn colmRn;
    public TableColumn colmT;
    public TableColumn colmA;
    public TableColumn colmCa;
    public TableColumn colmPri;

    {
    }
    public void initialize(){

        ObservableList<RoomSystem>obList= FXCollections.observableArrayList();
        obList.add(new RoomSystem("R001","Normal","availble","Adult 4","rs.3000.00"));
        obList.add(new RoomSystem("R002","Luxery","availble","adult 4,child 3","rs.10000.00"));
        obList.add(new RoomSystem("R003","Luxery","notavailble","Adult 4,child 3","rs.12000.00"));
        tblRoomDetail.setItems(obList);

        tblBooked.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
        tblBooked.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblBooked.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("contact"));
        tblBooked.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("email"));
        tblBooked.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("roomNumber"));
        tblBooked.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("price"));
        tblBooked.getColumns().get(6).setCellValueFactory(new PropertyValueFactory<>("time"));
        tblBooked.getColumns().get(7).setCellValueFactory(new PropertyValueFactory<>("meal"));
        
        tblRoomDetail.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("roomNumber"));
        tblRoomDetail.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("type"));
        tblRoomDetail.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("availble"));
        tblRoomDetail.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("capacity"));
        tblRoomDetail.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("price"));
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("../view/UserForm.fxml"));
        Scene scene=new Scene(parent);
        Stage stage=(Stage ) this.root.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        String id=txtId.getText();
        String name=txtName.getText();
        String contact=txtContact.getText();
        String email=txtEmail.getText();
        String roomNumber=txtRoomNumber.getText();
        String price=txtPrice.getText();
        String time=txtFromTo.getText();
        String meal=txtMeal.getText();
        ObservableList<RoomBook>bookList=tblBooked.getItems();
        RoomBook room=new RoomBook(id,name,contact,email,roomNumber,price,time,meal);
        bookList.add(room);
        tblBooked.refresh();
        txtContact.clear();
        txtEmail.clear();
        txtMeal.clear();
        txtPrice.clear();
        txtId.clear();
        txtFromTo.clear();
        txtRoomNumber.clear();
        txtName.clear();
        txtId.requestFocus();
    }
}
