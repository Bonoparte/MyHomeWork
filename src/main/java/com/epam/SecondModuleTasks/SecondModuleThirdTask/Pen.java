package com.epam.SecondModuleTasks.SecondModuleThirdTask;

public class Pen extends Stationery {
    private String color;

    public Pen(String title, double price, String color) {
        super(title, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{"+
                "title = '" + getTitle() +
                "\', price = " + getPrice() +
                ", color = '" + color  +
                "}";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
