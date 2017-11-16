package com.epam.SecondModuleTasks.SecondModuleThirdTask;

public class GelPen extends Pen {
    private double gelViscosity;

    public GelPen(String title, double price, String color, double gelViscosity) {
        super(title, price, color);
        this.gelViscosity = gelViscosity;
    }

    @Override
    public String toString() {
        return "GelPen{" +
                "title = '" + getTitle() +
                "\', price = " + getPrice() +
                ", color = '" + getColor()  +
                "\', gel viscosity = " + gelViscosity +
                "\'}";
    }
}
