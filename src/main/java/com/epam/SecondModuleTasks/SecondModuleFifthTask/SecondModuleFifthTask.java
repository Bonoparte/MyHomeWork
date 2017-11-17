package com.epam.SecondModuleTasks.SecondModuleFifthTask;


import java.util.ArrayList;
import java.util.List;

public class SecondModuleFifthTask {
    public static void main(String[] args) {
        Subject math = new Subject(EnumSubjectsNames.Math, (Double) 5.0);
        Subject psysics = new Subject(EnumSubjectsNames.Physics, (Double) 5.0);
        Subject psychology = new Subject(EnumSubjectsNames.Psychology, (Integer) 5);
        Student firstStudent = new Student("Anatoly Frolov");
        math.addStudent(firstStudent,4.9);
        psychology.addStudent(firstStudent);
        psysics.addStudent(firstStudent, 4.7);
        System.out.println(firstStudent);


    }
}
