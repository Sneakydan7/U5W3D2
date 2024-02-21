package com.danielecagnoni.U5W3D2.E1Adapter;

public class UserData {
    private String fullName;
    private int age;

    public void getData(DataSource dataSource) {
        fullName = dataSource.getFullName();
        age = dataSource.getAge();

    }
}
