package com.nf.dao;

import com.nf.entity.Phone;

public class Test {
    public static void main(String[] args) {
        PhoneDao dao=new PhoneInMemoryDao();

        System.out.println(dao.getPhoneByName("a"));
    }
}
