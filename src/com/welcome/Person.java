package com.welcome;

public class Person {
    private String name;
    private int phone;
    private String address;

    public Person(String _name , int _phone) {
        name = _name;
        phone = _phone;
    }

    public Person(String _name, int _phone,String _address) {
        name = _name;
        phone = _phone;
        address = _address;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int _phone) {
        phone = _phone;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress(String _address) {
        address = _address;
    }
}