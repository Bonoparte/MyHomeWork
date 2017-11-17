package com.epam.SecondModuleTasks.SecondModuleFifthTask;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Map;

public class MarksComparator implements Comparator<Map.Entry<EnumSubjectsNames,Number>> {


    @Override
    public int compare(Map.Entry<EnumSubjectsNames, Number> o1, Map.Entry<EnumSubjectsNames, Number> o2) {
        return new BigDecimal(o1.getValue().toString()).compareTo(new BigDecimal(o2.getValue().toString()));

    }
}
