package com.company;

public class City {
    private String name;
    private int population;
    private String hymn;

    public City() {
    }

    public City(String name, int population, String hymn) {
        this.name = name;
        this.population = population;
        this.hymn = hymn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getHymn() {
        return hymn;
    }

    public void setHymn(String hymn) {
        this.hymn = hymn;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", hymn='" + hymn + '\'' +
                '}';
    }
}
