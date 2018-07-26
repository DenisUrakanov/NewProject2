package com.company;

public class Person {
    private String name;
    private int moneyCash;

    public Person() {
    }

    public Person(String name, int moneyCash) {
        this.name = name;
        this.moneyCash = moneyCash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyCash() {
        return moneyCash;
    }

    public void setMoneyCash(int moneyCash) {
        this.moneyCash = moneyCash;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", moneyCash=" + moneyCash +
                '}';
    }
}
