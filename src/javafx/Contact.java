package javafx;

import javafx.scene.control.TextField;

public class Contact {
    private  String name;
    private  String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString(){
        return this.name + "---" + this.email;
    }
}
