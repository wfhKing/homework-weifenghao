package com.nf.dao;

import com.nf.entity.Phone;

public class NumberDao {
    private Phone phone;
    private int number;

    public NumberDao(Phone phone, int number) {
        this.phone = phone;
        this.number = number;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
