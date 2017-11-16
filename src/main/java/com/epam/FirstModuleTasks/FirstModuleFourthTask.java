package com.epam.FirstModuleTasks;

import java.util.Scanner;

public class FirstModuleFourthTask {
    public static void main(String[] args) {
        int elementsNumber = 1;
        Scanner in = new Scanner(System.in);
        while(elementsNumber %2 != 0){
            System.out.print("Enter elements number (even number): ");
            elementsNumber = in.nextInt();
            if (elementsNumber % 2 != 0)
                System.out.println("Number of elements is uneven");
        }
        double[] elements = new double[elementsNumber];
        for(int i = 0; i < elementsNumber; i++) {
            System.out.print("element[" + (i+1) + "] = ");
            elements[i] = in.nextDouble();
        }
        double max = elements[0] + elements[elementsNumber - 1];
        for (int i = 0; i < (elementsNumber / 2); i++){
            if (max < elements[i] + elements[elementsNumber - i - 1])
                max = elements[i] + elements[elementsNumber - i - 1];
        }
        System.out.println("searched value of max: "+max);
    }
}
