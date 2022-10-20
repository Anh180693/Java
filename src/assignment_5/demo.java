package assignment_5;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.awt.*;

public class demo {

    public TextField svname;
    public TextField svemail;
    public TextField svaddress;
    public TextField svage;
    public TextField svphone;
    public Text strname;
    public Text stremail;
    public Text straddress;
    public Text strage;
    public Text strphone;

    public void submit(ActionEvent actionEvent) {
        String name = svname.getText();
        strname.setText(name);

        String email = svemail.getText();
        stremail.setText(email);

        String address = svaddress.getText();
        straddress.setText(address);

        String age = svage.getText();
        strage.setText(age);

        String phone = svphone.getText();
        strphone.setText(phone);
    }
}
