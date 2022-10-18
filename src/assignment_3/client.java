package assignment_3;

import java.util.Date;

public class client {
    protected int maxKH;
    protected   String name;
    protected Date date;
    protected Double KW;

    public client(){

    }
    public client(int maxKH,String name,Date date,Double KW){
        this.maxKH =maxKH;
        this.name = name;
        this.date = date;
        this.KW = KW;
    }

    public int getMaxKH() {
        return maxKH;
    }

    public void setMaxKH(int maxKH) {
        this.maxKH = maxKH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getKW() {
        return KW;
    }

    public void setKW(Double KW) {
        this.KW = KW;
    }

    public Double tinhTien(){
        return getKW() * 2000 ;
    }
}




