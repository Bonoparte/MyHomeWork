package com.epam.SecondModuleTasks.SecondModuleFirstTask;

import java.util.Locale;
import java.util.Scanner;

public class SecondModuleFirstTask {
    public static void main(String[] args) {
        Pen firstPen = new Pen("Gel", "Black", 22.90);
        Pen secondPen = new Pen("Ink", "Blue", 11.5);
        Pen thirdPen = new Pen();
        System.out.println(firstPen.equals(secondPen));
        System.out.println(secondPen.equals(thirdPen));
        System.out.println(firstPen);
    }

}
