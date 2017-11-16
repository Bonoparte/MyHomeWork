package com.epam.FirstModuleTasks;

import java.util.Scanner;

public class FirstModuleSecondTask {
    public static void main(String[] args) {
        System.out.print("Enter the Epsilon Value: ");
        double epsilon;
        Scanner in = new Scanner(System.in);
        epsilon = in.nextDouble();
        double element = 0.5;
        int elementNumber=0;
        while(element>=epsilon){
            element=(double)1/(elementNumber+2);
            elementNumber++;
        }
        System.out.println("Number of element is " + elementNumber);
        for (int i=1; i<=elementNumber; i++) {
            element=(double)1/(i+1);
            System.out.println("a["+i+"] = "+element);
        }


    }
}
