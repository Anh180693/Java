package assignment_3;

import java.util.Date;

public class client1 extends  client{
    private String nationality;

    public client1(){

    }

    public client1 (int maxKH, String name, Date date, String nationality, Double KW){
        super(maxKH,name,date,KW);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    @Override
    public Double tinhTien(){
        return super.tinhTien();
    }

}
