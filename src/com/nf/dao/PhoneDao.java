package com.nf.dao;


import com.nf.entity.Phone;

import java.util.List;

public interface PhoneDao {
    Phone add(Phone phone);

    boolean delete(int id);

    boolean update(Phone phone);

    List<Phone> listAll();

    Phone getPhoneById(int id);

    List<Phone> getPhoneByName(String name);
}
