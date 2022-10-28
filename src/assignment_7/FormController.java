package assignment_7;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.Comparator;

import static assignment_7.StudentController.ls;
import static assignment_7.StudentController.lvView;

public class FormController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;

    public void Back(ActionEvent actionEvent) throws Exception{
        Parent contactPage = FXMLLoader.load(getClass().getResource("list.fxml"));
        Scene sc = new Scene(contactPage,800,600);
        Main.rootStage.setTitle("Contact JavaFX");
        Main.rootStage.setScene(sc);
    };

    public void Submit(ActionEvent actionEvent) {
        try{
            String name = txtName.getText();
            String email = txtEmail.getText();
            Integer mark = Integer.parseInt(txtMark.getText());
            ls.add(new Student(name,email,mark));
            lvView.setItems(ls);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }

    }
}
