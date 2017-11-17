package com.epam.SecondModuleTasks.SecondModuleFourthTask;
import com.epam.SecondModuleTasks.SecondModuleThirdTask.Stationery;
import java.util.Comparator;

public class PriceComparator implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
