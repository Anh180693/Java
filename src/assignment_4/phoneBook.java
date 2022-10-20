package assignment_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class phoneBook extends phone{
    ArrayList<phoneNumber> phoneList = new ArrayList<>();

    public ArrayList<phoneNumber> getPhoneList() {
        return phoneList;
    }

    @Override
    void insertPhone(String name, String phone) {
        for(phoneNumber p : getPhoneList()){
            if(p.getName().equals(name)){
                for(String s: p.getTel()){
                    if(s.equals(phone)){
                        return;
                    }
                }
                p.getTel().add(phone);
                return;
            }
        }
        phoneNumber pn = new phoneNumber(name,phone);
        getPhoneList().add(pn);
    }

    @Override
    void removePhone(String name) {
        for(phoneNumber p : getPhoneList()){
            if(p.getName().equals(name)){
                getPhoneList().remove(p);
                return;
            }
        }
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        for(phoneNumber p : getPhoneList()){
            if(p.getName().equals(name)) {
                p.getTel().remove(oldPhone);
                p.getTel().add(newPhone);
                return;
            }
        }
    }

    @Override
    phoneNumber searchPhone(String name) {
        for(phoneNumber p: getPhoneList()){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    void sort() {
        // bubble sort
//        for(int i=0;i<getPhoneList().size()-1;i++){
//            for(int j=0;j<getPhoneList().size()-i-1;j++){
//                if(getPhoneList().get(j).getName().compareTo(getPhoneList().get(j+1).getName()) >0){
//                    PhoneNumber pn = getPhoneList().get(j);
//                    getPhoneList().set(j,getPhoneList().get(j+1)); // arr[j]=arr[j+1]
//                    getPhoneList().set(j+1,pn);
//                }
//            }
//        }
        Collections.sort(getPhoneList(), new Comparator<phoneNumber>() {
            @Override
            public int compare(phoneNumber o1, phoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}