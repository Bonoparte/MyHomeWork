package com.epam.SecondModuleTasks.SecondModuleThirdTask;

import java.util.ArrayList;
import java.util.List;

public class SecondModuleThirdTask {
    public static void main(String[] args) {
        Stationery firstPen = new GelPen("Erich Krause pen", 220.50, "Black", 0.12 );
        Stationery secondPen = new BallPen("Simple pen", 20.30, "Blue", 0.1);
        Stationery exerciseBook = new ExerciseBook("Simple exercise book", 15.50, 48 );
        List<Stationery> neewbieSet = new ArrayList<>();
        boolean add = neewbieSet.add(firstPen);
        add = neewbieSet.add(secondPen);
        add = neewbieSet.add(exerciseBook);
        for (Stationery s:neewbieSet) {
            System.out.println(s);
        }

    }
}
