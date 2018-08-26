package com.nf.dao;


import com.nf.entity.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneInMemoryDao implements PhoneDao {

    private static List<Phone> phoneDB = new ArrayList<>();

    static {
        Phone p1 = new Phone(1, "OPPO R17", 3499.00, "8G+128G", "OPPO", "八核");
        Phone p2 = new Phone(2, "Apple iPhone 8 Plus", 5599.00, "64G", "Apple", "其他");
        Phone p3 = new Phone(3, "荣耀9i", 1399.00, "4GB+64GB", "华为", "八核");
        Phone p4 = new Phone(4, "小米Max3", 1999.00, "6G+128G", "小米", "八核");
        Phone p5 = new Phone(5, "三星 Galaxy Note9", 6999.00, "6G+128G", "三星", "八核");
        Phone p6 = new Phone(6, "小米6X", 1399.00, "4G+64G", "小米", "八核");
        Phone p7 = new Phone(7, "8848 钛金手机 V1", 9999.00, "6G+128G", "8848", "四核");
        Phone p8 = new Phone(8, "联想 Z5", 1299.00, "6G+64G", "联想", "八核");
        Phone p9 = new Phone(9, "克里特（kreta） ONE", 8999.00, "6G+128G", "克里特", "八核");
        Phone p10 = new Phone(10, "魅族 15", 1998.00, "4G+64G", "魅族", "八核");

        phoneDB.add(p1);
        phoneDB.add(p2);
        phoneDB.add(p4);
        phoneDB.add(p5);
        phoneDB.add(p6);
        phoneDB.add(p7);
        phoneDB.add(p8);
        phoneDB.add(p9);
        phoneDB.add(p10);
    }


    @Override
    public Phone add(Phone phone) {
        if (phoneDB.add(phone)) {
            return phone;
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        for (Phone phone : phoneDB) {
            if (phone.getId() == id) {
                return phoneDB.remove(phone);
            }
        }
        return false;
    }

    @Override
    public boolean update(Phone phone) {
        for (Phone newPhone : phoneDB) {
            if (newPhone.getId() == phone.getId()) {
                newPhone.setName(phone.getName());
                newPhone.setPrice(phone.getPrice());
                newPhone.setMemory(phone.getMemory());
                newPhone.setPress(phone.getPress());
                newPhone.setCpu(phone.getCpu());
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Phone> listAll() {
        return phoneDB;
    }

    @Override
    public Phone getPhoneById(int id) {
        for (Phone phone : phoneDB) {
            if (phone.getId() == id) {
                return phone;
            }
        }
        return null;
    }

    @Override
    public List<Phone> getPhoneByName(String name) {
        ArrayList<Phone> phones = new ArrayList<>();
        for (Phone phone : phoneDB) {
            if(phone.getName().toLowerCase().contains(name.toLowerCase())){
                phones.add(phone);
            }
        }
        return phones;
    }
}
