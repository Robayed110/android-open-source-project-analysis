package com.example.calculator;

public class project02 {
    private String name;
    private int roll;
    private int id;

    public project02(String name, int roll, int id) {
        this.name = name;
        this.roll = roll;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
