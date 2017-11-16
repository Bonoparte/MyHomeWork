package com.epam.SecondModuleTasks.SecondModuleThirdTask;

public class ExerciseBook extends Stationery {
    private int numberOfPages;

    public ExerciseBook(String title, double price, int numberOfPages) {
        super(title, price);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "ExerciseBook{" +
                "title = '" + getTitle() +
                "\', price = " + getPrice() +
                ", numberOfPages = " + numberOfPages +
                '}';
    }
}
