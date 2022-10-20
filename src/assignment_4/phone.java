package assignment_4;

public abstract class phone{
    abstract void insertPhone(String name, String phone);

    abstract void removePhone(String name);

    abstract void updatePhone(String name,String oldPhone, String newPhone);

    abstract phoneNumber searchPhone(String name);

    abstract void sort();
}
