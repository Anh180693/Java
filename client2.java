package assignment_3;

import java.util.Date;

public class client2 extends  client{
    private String customers;
    public client2(){
    }
    public client2 (int maxKH, String name, Date date, String customers, Double KW, Double total){
        super(maxKH,name,date,KW,total);
        this.customers = customers;
    }
    public Double thanhToan(){
            double a = 0;
        if (getKW() < 50){
            a = getKW() * 1000;
        } else if (getKW() >= 50 && getKW() < 100) {
            a = 50000 + ((getKW() - 50) * 1200);
        } else if (getKW() >=100 && getKW() < 200) {
            a= 110000 + ((getKW() - 100) * 1500);
        }
        else {
            a = 185000 + ((getKW() - 200) * 2000);
        }
        return a;
    }
}
