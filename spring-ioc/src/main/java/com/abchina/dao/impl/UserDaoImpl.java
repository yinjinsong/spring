package com.abchina.dao.impl;

import com.abchina.dao.UserDao;

public class UserDaoImpl implements UserDao {
    private String company;
    private int age;

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void save() {
        System.out.println(company + "====" + age);
        System.out.println("UserDao save method running...");
    }
}
