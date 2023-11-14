package com.ngothanhdat63133206.recycleviewexample;

public class Country {
    private String countryName;
    private String countryFlag;
    private int population;
    public Country(String name, String flag, int pop){
        countryName = name;
        countryFlag = flag;
        population = pop;
    }
    // getters, setters
    public String getCountryName() {
        return this.countryName;
    }
    public String getCountryFlag() {
        return this.countryName;
    }
    public int getPopulation() {
        return this.population;
    }
}
