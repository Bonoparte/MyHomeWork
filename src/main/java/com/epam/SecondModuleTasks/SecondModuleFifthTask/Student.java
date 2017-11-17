package com.epam.SecondModuleTasks.SecondModuleFifthTask;

import java.util.*;

public class Student  {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return studentSubjects != null ? studentSubjects.equals(student.studentSubjects) : student.studentSubjects == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (studentSubjects != null ? studentSubjects.hashCode() : 0);
        return result;
    }

    private Map<EnumSubjectsNames,Number> studentSubjects;

    public String getName() {
        return name;
    }


    public Student(String name) {
        this.name = name;
        this.studentSubjects = new HashMap<>();
    }

    public void addSubject(Subject subject, Number mark) {
        this.studentSubjects.put(subject.getSubjectName(), mark);
    }

    @Override
    public String toString() {
        List list = new ArrayList(this.studentSubjects.entrySet());
        MarksComparator comp = new MarksComparator();
        Collections.sort(list,comp);

        return "Student{" +
                "name = '" + name + '\'' +
                ", student subjects = " + list +
                '}';
    }
}
