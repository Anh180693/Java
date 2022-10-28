package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;
import java.util.Observable;

public class contactController {
    public TextField Name;
    public TextField email;
    public ListView<Contact> lv;
    private ObservableList<Contact> ls = FXCollections.observableArrayList();
    public void submit(ActionEvent actionEvent) {
        String name = Name.getText();
        String Email = email.getText();

        Contact ct = new Contact(name,Email);
        ls.add(ct);
        print();
    }

    public  void print(){
        lv.setItems(ls);
    }
}
