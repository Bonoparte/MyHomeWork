package com.epam.SecondModuleTasks.SecondModuleThirdTask;

public class Stationery implements Comparable<Stationery>{
    private String title;
    private Double price;


    public Stationery(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public  String getTitle(){
        return this.title;
    };

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

    @Override
    public int compareTo(Stationery o) {
        if (this.price.compareTo(o.price)!=0)
            return this.price.compareTo(o.price);
        else
            return this.title.compareTo(o.title);
    }
}
