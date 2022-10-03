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
import utill.MealSystem;

import java.io.IOException;
import java.util.ArrayList;

public class MealFormController {
    public AnchorPane mealContext;
    public JFXTextField txtMealPlane;
    public JFXTextField txtPrice;
    public JFXTextField txtDescription;
    public TableView <MealSystem>tblMealDetails;
    public TableColumn colmMealPlane;
    public TableColumn colmPrice;
    public TableColumn colmDescription;
    public TableColumn colmDelete;
    static ArrayList<MealSystem>mealList=new ArrayList<MealSystem>();

    public void initialize(){
      tblMealDetails.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("plane"));
      tblMealDetails.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("price"));
      tblMealDetails.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("destription"));
    }

    public void saveOnAction(ActionEvent actionEvent) {
        String mealPlane=txtMealPlane.getText();
        String price=txtPrice.getText();
        String description=txtDescription.getText();

        ObservableList<MealSystem>meal=tblMealDetails.getItems();
        MealSystem mealsystem=new MealSystem(mealPlane,price,description);
        meal.add(mealsystem);
        tblMealDetails.refresh();
        txtMealPlane.clear();
        txtPrice.clear();
        txtDescription.clear();
        txtMealPlane.requestFocus();
    }
    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"));
        Stage stage=(Stage ) this.mealContext.getScene().getWindow();
        Scene scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
