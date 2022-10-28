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

public class StudentController {
    public static ListView<Student> lvView;
    public static ObservableList<Student> ls = FXCollections.observableArrayList();

    public void Add(ActionEvent actionEvent) throws Exception{
        Parent contactPage = FXMLLoader.load(getClass().getResource("form.fxml"));
        Scene sc = new Scene(contactPage,800,600);
        Main.rootStage.setTitle("Contact JavaFX");
        Main.rootStage.setScene(sc);
    }
}
