package assignment_3;

import java.util.Date;

public class client2 extends  client{
    private String customers;
    public client2(){
    }
    public client2 (int maxKH, String name, Date date, String customers, Double KW){
        super(maxKH,name,date,KW);
        this.customers = customers;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    @Override
    public Double tinhTien(){
            double a = 0;
        if (getKW() < 50){
            a = getKW() * 1000;
        } else if (getKW() < 100) {
            a = 50000 + ((getKW() - 50) * 1200);
        } else if (getKW() < 200) {
            a= 110000 + ((getKW() - 100) * 1500);
        }
        else {
            a = 185000 + ((getKW() - 200) * 2000);
        }
        return a;
    }
}
