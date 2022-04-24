package com.example.android.hackathon;

public class MacroSample {
    private int Year;
    private String China;
    private String India;
    private String USA;

    public String getUSA() {
        return USA;
    }

    public void setUSA(String USA) {
        this.USA = USA;
    }

    public String getIndia() {
        return India;
    }

    public void setIndia(String india) {
        India = india;
    }

    public String getChina() {
        return China;
    }

    public void setChina(String china) {
        China = china;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "MacroSample{" +
                "Year=" + Year +
                ", China='" + China + '\'' +
                ", India='" + India + '\'' +
                ", USA='" + USA + '\'' +
                '}';
    }
}
