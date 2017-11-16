package com.epam.SecondModuleTasks.SecondModuleSecondTask;

public class Stationery {
    private String title;
    private double price;

    public Stationery() {
        this.title = "Something that's no one knows how to call";
        this.price = 20;
    }

    public Stationery(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
