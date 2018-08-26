package com.nf.entity;

public class Phone {
    private int id;
    private String name;    //名称
    private double price;    //价格
    private String memory;  //内存
    private String press;   //厂商
    private String cpu;     //CPU核数

    public Phone(String name, double price, String memory, String press, String cpu) {
        this.name = name;
        this.price = price;
        this.memory = memory;
        this.press = press;
        this.cpu = cpu;
    }

    public Phone(int id, String name, double price, String memory, String press, String cpu) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.memory = memory;
        this.press = press;
        this.cpu = cpu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", memory='" + memory + '\'' +
                ", press='" + press + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
