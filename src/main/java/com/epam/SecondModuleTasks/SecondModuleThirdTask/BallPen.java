package com.epam.SecondModuleTasks.SecondModuleThirdTask;

public class BallPen extends Pen {
    private double coreThikness;

    public BallPen(String title, double price, String color, double coreThikness) {
        super(title, price, color);
        this.coreThikness = coreThikness;
    }

    @Override
    public String toString() {
        return "BallPen{" +
                "title = '" + getTitle() +
                "\', price = " + getPrice() +
                ", color = '" + getColor()  +
                "\', core thikness = " + coreThikness +
                "\'}";
    }
}
