package com.epam.SecondModuleTasks.SecondModuleFourthTask;

import com.epam.SecondModuleTasks.SecondModuleThirdTask.BallPen;
import com.epam.SecondModuleTasks.SecondModuleThirdTask.ExerciseBook;
import com.epam.SecondModuleTasks.SecondModuleThirdTask.GelPen;
import com.epam.SecondModuleTasks.SecondModuleThirdTask.Stationery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondModuleFourthTask {
    public static void main(String[] args) {
        Stationery firstPen = new GelPen("Erich Krause pen", 220.50, "Black", 0.12 );
        Stationery secondPen = new BallPen("Simple zx", 20.30, "Blue", 0.1);
        Stationery exerciseBook = new ExerciseBook("Simple xz", 20.30, 48 );
        List<Stationery> neewbieSet = new ArrayList();
        boolean add = neewbieSet.add(firstPen);
        add = neewbieSet.add(secondPen);
        add = neewbieSet.add(exerciseBook);
        Collections.sort(neewbieSet);
        for (Stationery s:neewbieSet) {
            System.out.println(s);
        }
        System.out.println("\n\n");
        TitleComparator titleComparator = new TitleComparator();
        Collections.sort(neewbieSet,titleComparator);
        for (Stationery s:neewbieSet) {
            System.out.println(s);
        }
        System.out.println("\n\n");
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(neewbieSet,priceComparator);
        for (Stationery s:neewbieSet) {
            System.out.println(s);
        }


    }
}
