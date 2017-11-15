package main.java.epam.FirstModuleTasks;

import java.util.Scanner;

public class FirstModuleThirdTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b;
        System.out.println("Enter function boundaries (a<b):");
        System.out.print("a = ");
        a = in.nextDouble();
        System.out.print("b = ");
        b = in.nextDouble();
        System.out.print("Enter the step Value: ");
        double step;
        step = in.nextDouble();
        System.out.println("|    x    |   F(x)   |");
        while(a<=b){
            System.out.printf("|%9f|%10f|\n",a,Math.tan(2*a)-3);
            a=a+step;
        }
        if (a-step!=b)
            System.out.printf("|%9f|%10f|\n",b,Math.tan(2*b)-3);

    }
}
