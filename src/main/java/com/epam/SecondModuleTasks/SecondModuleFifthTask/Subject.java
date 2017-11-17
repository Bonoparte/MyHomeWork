package com.epam.SecondModuleTasks.SecondModuleFifthTask;

import java.util.*;

public class Subject<T extends EnumSubjectsNames,U extends Number >  {
    private T subjectName;

    public T getSubjectName() {
        return subjectName;
    }

    public U getDefaultMark() {
        return defaultMark;
    }

    private U defaultMark;
    private Map<String, U> students;

    public Subject(T subjectName, U defaultMark) {
        this.subjectName = subjectName;
        this.defaultMark = defaultMark;
        this.students = new HashMap<>();
    }

    public void addStudent (Student student, U mark ){
        if (students.containsKey(student.getName()))
            System.out.println("This student already in this group");
        else {
            students.put(student.getName(), mark);
            student.addSubject(this, mark);

        }
    }
    public void addStudent (Student student){
        if (students.containsKey(student.getName()))
            System.out.println("This student already in this group");
        else
            students.put(student.getName(),this.defaultMark);
            student.addSubject(this, this.defaultMark);
    }

}
