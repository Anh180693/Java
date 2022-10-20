package assignment_4;
import java.util.ArrayList;

public class phoneNumber {
    String name;
    ArrayList<String> tel;

    public phoneNumber(String name,String tel) {
        this.name = name;
        this.tel = new ArrayList<>();
        this.tel.add(tel);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getTel() {
        return tel;
    }
}