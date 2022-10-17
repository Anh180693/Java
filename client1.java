package assignment_3;

import java.util.Date;

public class client1 extends  client{
    private String nationality;

    public client1(){

    }

    public client1 (int maxKH, String name, Date date, String nationality, Double KW, Double total){
        super(maxKH,name,date,KW,total);
        this.nationality = nationality;
    }

    public Double tinhTien(){
        double a = getKW() * 2000;
        setTotal(a);
        return getTotal();
    }

}
