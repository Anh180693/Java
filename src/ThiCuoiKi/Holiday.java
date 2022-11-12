package ThiCuoiKi;

import java.util.ArrayList;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public boolean  inSameMonth(Holiday a){
        if(a.month == this.month){
            return true;
        }
        return false;
    }

    public static double avgDate(Holiday[] S) {
        int avg = 0;
        for(int i = 0; i < S.length; i++){
            avg = avg + S[i].day;
        }
        return ((double) avg)/S.length;
    }

    public void createsHoliday(){
        Holiday a = new Holiday("IndependenceDay",4,"July");
    }
}
